/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao;

import java.sql.Connection;

/**
 *
 * @author CELESTIN
 */
public interface IDataSource {
    
    /**
     *Connexion a la base de données
     * @return 
     */
    public Connection connectionToDataBase();
    
}
