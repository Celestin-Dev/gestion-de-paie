/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao.sqlite;

import ea2i.tpe.dao.IDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CELESTIN
 */
public class SqlDataSource implements IDataSource{
    
    private Connection connection;

    @Override
    public Connection connectionToDataBase() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:paie_db.db");
            System.out.println("Connection Succesfull !");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SqlDataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    
    
}
