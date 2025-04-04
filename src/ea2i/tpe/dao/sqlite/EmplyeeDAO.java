/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao.sqlite;

import ea2i.tpe.dao.IEmpolyee;
import ea2i.tpe.model.MEmployee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CELESTIN
 */
public class EmplyeeDAO implements IEmpolyee{

    @Override
    public void createEmployee(MEmployee e) {
        String sql = "INSERT INTO employee_tb(name, first_name, birthday,address,number_phone, poste) VALUES (?, ?, ?, ?, ?, ?)";
        Connection connection = new SqlDataSource().connectionToDataBase();
        
        try {
            try (PreparedStatement pst = connection.prepareStatement(sql)) {
                pst.setString(1, e.getName());
                pst.setString(2, e.getFirstName());
                pst.setDate(3, e.getBirthday());
                pst.setString(4, e.getAddress());
                pst.setString(5, e.getNumero());
                pst.setString(6, e.getPoste());
                pst.executeUpdate();
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void updateEmployee(MEmployee e) {
        String sql = "UPDATE employee_tb SET name=?, first_name=?, birthday=?, address=?, number_phone=?, poste=? WHERE id_employee=?";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, e.getName());
            pst.setString(2, e.getFirstName());
            pst.setDate(3, e.getBirthday());
            pst.setString(4, e.getAddress());
            pst.setString(5, e.getNumero());
            pst.setString(6, e.getPoste());
            pst.setLong(7, e.getId_employee());
            pst.executeUpdate();
            pst.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteEmployee(MEmployee e) {
        String sql = "DELETE FROM employee_tb where id_employee like'%"+ e.getId_employee()+ "%'";
        Connection connection = new SqlDataSource().connectionToDataBase();
        
        try {
            Statement st = connection.createStatement();
            int status = st.executeUpdate(sql);
            if(status > 0)
                System.out.println("Delete succesfull");
            else
                System.out.println("delete failed");
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<MEmployee> readAllEmployee() {
        MEmployee e = null;
        ArrayList<MEmployee> list = new ArrayList<>();
        String sql = "SELECT * FROM employee_tb ORDER BY id";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                e = new MEmployee(
                        rs.getInt("id"), 
                        rs.getString("name"),
                        rs.getString("first_name"),
                        rs.getDate("birthday"),
                        rs.getString("address"),
                        rs.getString("number_phone"),
                        rs.getString("poste")
                );
                list.add(e); 
            }
            rs.close();
            st.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public ArrayList<MEmployee> searchEmployee(String name) {
        MEmployee e = null;
        ArrayList<MEmployee> listEmployee = new ArrayList<>();
        String sql = "SELECT id, name, first_name FROM employee_tb WHERE name like'%"+ name +"%'";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                e = new MEmployee(
                        rs.getInt("id"), 
                        rs.getString("name"),
                        rs.getString("first_name")
                ); 
                listEmployee.add(e);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listEmployee;
    }
    
}
