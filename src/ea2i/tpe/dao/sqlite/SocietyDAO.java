/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao.sqlite;

import ea2i.tpe.dao.ISociety;
import ea2i.tpe.model.Society;
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
public class SocietyDAO implements ISociety {

    @Override
    public void createSociety(Society society) {
        String sql = "INSERT INTO society_tb(name, domaine, email, logo, password) VALUES (?, ?, ?, ?, ?)";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, society.getName());
            pst.setString(2, society.getDomaine());
            pst.setString(3, society.getEmail());
            pst.setString(4, society.getLogo());
            pst.setString(5, society.getPassword());
            pst.execute();
            pst.close();
            connection.close();
            System.out.println("Insert society succesfull");
        } catch (SQLException ex) {
            System.out.println("Insert society failed");
            Logger.getLogger(SocietyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public ArrayList<Society> readSociety() {
        Society s = null;
        ArrayList<Society> list= new ArrayList<>();
        String sql = "SELECT * FROM society_tb";
        Connection connection = new SqlDataSource().connectionToDataBase();
        
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                s = new Society( 
                        rs.getInt("id"),
                        rs.getString("name"), 
                        rs.getString("domaine"), 
                        rs.getString("email"), 
                        rs.getString("logo"), 
                        rs.getString("password")
                );
                list.add(s);
            }
            rs.close();
            st.close();
            connection.close();
            System.out.println("selected society succesfull!");
        } catch (SQLException ex) {
            System.out.println("selected society failed");
            Logger.getLogger(SocietyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    }

    @Override
    public void updateSociety(Society society) {
        String sql = "UPDATE society_tb SET name=?, domaine=?, email=?, logo=?, password=?";
        Connection connection = new SqlDataSource().connectionToDataBase();
        
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, society.getName());
            pst.setString(2, society.getDomaine());
            pst.setString(3, society.getEmail());
            pst.setString(4, society.getLogo());
            pst.setString(5, society.getPassword());
            pst.executeUpdate();
            pst.close();
            connection.close();
            System.out.println("update succesfull!");
        } catch (SQLException ex) {
            System.out.println("update failed !");
            Logger.getLogger(SocietyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @Override
    public void deleteSociety(Society society) {
        String sql = "DELETE FROM society_tb WHERE id like '%"+ society.getId()+ "%'";
        Connection connection = new SqlDataSource().connectionToDataBase();
        
        try {
            Statement st = connection.createStatement();
            int status = st.executeUpdate(sql);
            if(status > 0){
                System.out.println("Delete sucesfull");
            }else
                System.out.println("Delete failed");
        } catch (SQLException ex) {
            System.out.println("Delete failed");
            Logger.getLogger(SocietyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
