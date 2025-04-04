/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao.sqlite;

import ea2i.tpe.dao.ICotisation;
import ea2i.tpe.model.MCotisation;
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
public class CotisationDAO implements ICotisation{

    @Override
    public void createAvantages(MCotisation cotisation) {
        String sql = "INSERT INTO cotisation_tb(id_employee, type_cotisation, montant_cotisation) VALUES (?, ?, ?)";
        Connection connection = new SqlDataSource().connectionToDataBase();
        
        try {
            try (PreparedStatement pst = connection.prepareStatement(sql)) {
                pst.setLong(1,  cotisation.getId_employee());
                pst.setString(2, cotisation.getType_cotisation());
                pst.setDouble(3, cotisation.getMontant());
                pst.executeUpdate();
            }
            connection.close();
            System.out.println("Insertion succesfull");
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<MCotisation> readAvantages() {
        MCotisation cotisation;
        ArrayList<MCotisation> list = new ArrayList<>();
        String sql = "SELECT * FROM cotisation_tb ORDER BY id_cotisation";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cotisation = new MCotisation( 
                        rs.getLong("id_cotisation"),
                        rs.getLong("id_employee"),
                        rs.getString("type_cotisation"),
                        rs.getDouble("montant_cotisation")
                );
                list.add(cotisation); 
            }
            rs.close();
            st.close();
            connection.close();
            System.out.println("selected succesfull");
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void updateAvantages(MCotisation cotisation) {
        String sql = "UPDATE cotisation_tb SET id_employee=?, type_cotisation=?, montant_cotisation=? WHERE id_employee=?";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setLong(1, cotisation.getId_employee());
            pst.setString(2, cotisation.getType_cotisation());
            pst.setDouble(3, cotisation.getMontant());
            pst.setLong(4, cotisation.getId_employee());
            pst.executeUpdate();
            pst.close();
            connection.close();
            System.out.println("update succesfull");
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteAvantages(MCotisation cotisation) {
        String sql = "DELETE FROM cotisation_tb where id_employee like'%"+ cotisation.getId_employee()+ "%'";
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
