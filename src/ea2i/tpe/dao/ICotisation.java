/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao;

import ea2i.tpe.model.MCotisation;
import java.util.ArrayList;

/**
 *
 * @author CELESTIN
 */
public interface ICotisation {
    //creation de cotisation
    public void createAvantages(MCotisation cotisation);
    //Lecture de la cotisation
    public ArrayList<MCotisation> readAvantages();
    //modification cotisation
    public void updateAvantages(MCotisation cotisation);
    //suppression cotisation
    public void deleteAvantages(MCotisation cotisation);
}
