/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao.sqlite;

import ea2i.tpe.dao.IPrime;
import ea2i.tpe.model.MPrime;
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
public class PrimeDAO implements IPrime{

    @Override
    public void createPrime(MPrime prime) {
        String sql = "INSERT INTO prime_tb(id_employee, type_prime, montant_prime) VALUES (?, ?,?)";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setLong(1, prime.getId_employee());
            pst.setString(2, prime.getType_prime());
            pst.setDouble(3, prime.getMontant_prime());
            pst.execute();
            pst.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PrimeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<MPrime> readPrime() {
        MPrime prime;
        ArrayList<MPrime> listprime = new ArrayList<>();
        String sql = "SELECT * FROM prime_tb ORDER BY id_prime";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                prime = new MPrime(
                        rs.getLong("id_prime"), 
                        rs.getLong("id_employee"),
                        rs.getString("type_prime"),
                        rs.getDouble("montant_prime")
                );
                listprime.add(prime); 
            }
            rs.close();
            st.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listprime;
    }

    @Override
    public void updatePrime(MPrime prime) {
        String sql = "UPDATE prime_tb SET id_employee=?, type_prime=?, montant_prime=? WHERE id_employee=?";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setLong(1, prime.getId_employee());
            pst.setString(2, prime.getType_prime());
            pst.setDouble(3, prime.getMontant_prime());
            pst.setLong(4, prime.getId_employee());
            pst.executeUpdate();
            pst.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deletePrime(MPrime prime) {
        String sql = "DELETE FROM prime_tb where id_employee like'%"+ prime.getId_employee()+ "%'";
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
