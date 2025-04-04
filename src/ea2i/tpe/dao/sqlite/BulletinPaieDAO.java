/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao.sqlite;

import ea2i.tpe.dao.IBulletinPaie;
import ea2i.tpe.model.MBulletinPaie;
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
public class BulletinPaieDAO implements IBulletinPaie{

    @Override
    public void createMBulletinPaie(MBulletinPaie bulletiPaie) {
        String sql = "INSERT INTO bulletin_tb(id_employee, salaire_brut, salaire_net) VALUES (?, ?, ?)";
        Connection connection = new SqlDataSource().connectionToDataBase();
        
        try {
            try (PreparedStatement pst = connection.prepareStatement(sql)) {
                pst.setLong(1,  bulletiPaie.getId_employee());
                pst.setDouble(2, bulletiPaie.getSalaire_brut());
                pst.setDouble(3, bulletiPaie.getSalaire_net());
                pst.executeUpdate();
            }
            connection.close();
            System.out.println("Insertion succesfull");
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<MBulletinPaie> readMBulletinPaie() {
        MBulletinPaie bulletin;
        ArrayList<MBulletinPaie> list = new ArrayList<>();
        String sql = "SELECT * FROM bulletin_tb ORDER BY id_paie";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                bulletin = new MBulletinPaie( 
                        rs.getLong("id_paie"),
                        rs.getLong("id_employee"),
                        rs.getDouble("salaire_brut"),
                        rs.getDouble("salaire_net")
                );
                list.add(bulletin); 
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
    public void updateMBulletinPaie(MBulletinPaie bulletiPaie) {
        String sql = "UPDATE bulletin_tb SET id_employee=?, salaire_brut=?, salaire_net=? WHERE id_employee=?";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setLong(1, bulletiPaie.getId_employee());
            pst.setDouble(2, bulletiPaie.getSalaire_brut());
            pst.setDouble(3, bulletiPaie.getSalaire_net());
            pst.setLong(4, bulletiPaie.getId_employee());
            pst.executeUpdate();
            pst.close();
            connection.close();
            System.out.println("update succesfull");
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteMBulletinPaie(MBulletinPaie bulletiPaie) {
        String sql = "DELETE FROM bulletin_tb where id_employee like'%"+ bulletiPaie.getId_employee()+ "%'";
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
