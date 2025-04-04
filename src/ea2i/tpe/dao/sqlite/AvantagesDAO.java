/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao.sqlite;

import ea2i.tpe.dao.IAvantages;
import ea2i.tpe.model.MAvantages;
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
public class AvantagesDAO implements IAvantages{

    @Override
    public void createAvantages(MAvantages avantage) {
        String sql = "INSERT INTO avantages_tb(id_employee, type_avantage, montant_avantage) VALUES (?, ?, ?)";
        Connection connection = new SqlDataSource().connectionToDataBase();
        
        try {
            try (PreparedStatement pst = connection.prepareStatement(sql)) {
                pst.setLong(1,  avantage.getId_employee());
                pst.setString(2, avantage.getType_avantage());
                pst.setDouble(3, avantage.getMontant_avantage());
                pst.executeUpdate();
            }
            connection.close();
            System.out.println("Insertion succesfull");
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<MAvantages> readAvantages() {
        MAvantages avantages;
        ArrayList<MAvantages> listAvantage = new ArrayList<>();
        String sql = "SELECT * FROM avantages_tb ORDER BY id_avantage";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                avantages = new MAvantages( 
                        rs.getLong("id_avantage"),
                        rs.getLong("id_employee"),
                        rs.getString("type_avantage"),
                        rs.getDouble("montant_avantage")
                );
                listAvantage.add(avantages); 
            }
            rs.close();
            st.close();
            connection.close();
            System.out.println("avantage selected succesfull");
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listAvantage;
    }

    @Override
    public void updateAvantages(MAvantages avantage) {
        String sql = "UPDATE avantages_tb SET id_employee=?, type_avantage=?, montant_avantage=? WHERE id_employee=?";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setLong(1, avantage.getId_employee());
            pst.setString(2, avantage.getType_avantage());
            pst.setDouble(3, avantage.getMontant_avantage());
            pst.setLong(4, avantage.getId_employee());
            pst.executeUpdate();
            pst.close();
            connection.close();
            System.out.println("update succesfull");
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteAvantages(MAvantages avantage) {
        String sql = "DELETE FROM avantages_tb where id_employee like'%"+ avantage.getId_employee()+ "%'";
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
    
}
