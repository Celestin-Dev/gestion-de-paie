/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao.sqlite;

import ea2i.tpe.dao.IAbsence;
import ea2i.tpe.model.MAbsence;
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
public class AbsenceDAO implements IAbsence{

    @Override
    public void createMAbsence(MAbsence absence) {
        String sql = "INSERT INTO absence_tb(id_employee, type_absence, date_debut, date_fin) VALUES (?, ?, ?, ?)";
        Connection connection = new SqlDataSource().connectionToDataBase();
        
        try {
            try (PreparedStatement pst = connection.prepareStatement(sql)) {
                pst.setLong(1,  absence.getIdEmployee());
                pst.setString(2, absence.getTypeAbsence());
                pst.setDate(3, absence.getDateDebut());
                pst.setDate(4, absence.getDateFin());
                pst.executeUpdate();
            }
            connection.close();
            System.out.println("Insertion succesfull");
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<MAbsence> readMAbsence() {
        MAbsence absence;
        ArrayList<MAbsence> list = new ArrayList<>();
        String sql = "SELECT * FROM absence_tb ORDER BY id_absence";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                absence = new MAbsence( 
                        rs.getLong("id_absence"),
                        rs.getLong("id_employee"),
                        rs.getString("type_absence"),
                        rs.getDate("date_debut"),
                        rs.getDate("date_fin")
                );
                list.add(absence); 
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
    public void updateMAbsence(MAbsence absence) {
        String sql = "UPDATE absence_tb SET id_employee=?, type_absence=?, date_debut=?, date_fin=? WHERE id_employee=?";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setLong(1, absence.getIdEmployee());
            pst.setString(2, absence.getTypeAbsence());
            pst.setDate(3, absence.getDateDebut());
            pst.setDate(4, absence.getDateFin());
            pst.executeUpdate();
            pst.close();
            connection.close();
            System.out.println("update succesfull");
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @Override
    public void deleteMAbsence(MAbsence absence) {
        String sql = "DELETE FROM absence_tb where id_employee like'%"+ absence.getIdEmployee()+ "%'";
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
