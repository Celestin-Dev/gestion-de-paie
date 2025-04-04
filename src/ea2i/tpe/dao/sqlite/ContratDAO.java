/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao.sqlite;

import ea2i.tpe.dao.IContrat;
import ea2i.tpe.model.MContrat;
import java.sql.Connection;
import java.sql.Date;
;import java.sql.PreparedStatement;
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
public class ContratDAO implements IContrat{

    @Override
    public void createContrat(MContrat contrat) {
        String sql = "INSERT INTO contrat_tb(id_employee, type_contrat, date_debut, date_fin, salaire) VALUES (?, ?, ?, ?, ?)";
        Connection connection = new SqlDataSource().connectionToDataBase();
        
        try {
            try (PreparedStatement pst = connection.prepareStatement(sql)) {
                pst.setLong(1,  contrat.getId_employe());
                pst.setString(2, contrat.getType_contrat());
                pst.setDate(3, (Date) contrat.getDebut_contrat());
                pst.setDate(4, (Date) contrat.getFin_contrat());
                pst.setDouble(5, contrat.getSalaire());
                pst.executeUpdate();
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<MContrat> readContrat() {
        MContrat contrat;
        ArrayList<MContrat> listContrat = new ArrayList<>();
        String sql = "SELECT * FROM contrat_tb ORDER BY id_contrat";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                contrat = new MContrat(
                        rs.getLong("id_contrat"), 
                        rs.getLong("id_employee"),
                        rs.getString("type_contrat"),
                        rs.getDate("date_debut"),
                        rs.getDate("date_fin"),
                        rs.getDouble("salaire")
                );
                listContrat.add(contrat); 
            }
            rs.close();
            st.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listContrat;
    }

    @Override
    public void updateContrat(MContrat contrat) {
        String sql = "UPDATE contrat_tb SET id_employee=?, type_contrat=?, date_debut=?, date_fin=?, salaire=? WHERE id_employee=?";
        Connection connection = new SqlDataSource().connectionToDataBase();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setLong(1, contrat.getId_employe());
            pst.setString(2, contrat.getType_contrat());
            pst.setDate(3, (Date) contrat.getDebut_contrat());
            pst.setDate(4, (Date) contrat.getFin_contrat());
            pst.setDouble(5, contrat.getSalaire());
            pst.setLong(6, contrat.getId_employe());
            
            pst.executeUpdate();
            pst.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmplyeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteContrat(MContrat contrat) {
       String sql = "DELETE FROM contrat_tb where id_employee like'%"+ contrat.getId_employe()+ "%'";
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
