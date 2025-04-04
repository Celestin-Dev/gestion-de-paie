/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao;

import ea2i.tpe.model.Society;
import java.util.ArrayList;

/**
 *
 * @author CELESTIN
 */
public interface ISociety {
    //creation de compte dans ce appliction
    public void createSociety(Society society);
    //Lu le compte de society
    public ArrayList<Society> readSociety();
    //modification de compte de society
    public void updateSociety(Society society);
    //suppression de compte
    public void deleteSociety(Society society);
    
}
