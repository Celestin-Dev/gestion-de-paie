/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao;

import ea2i.tpe.model.MContrat;
import java.util.ArrayList;

/**
 *
 * @author CELESTIN
 */
public interface IContrat {
    
    //creation de compte dans ce appliction
    public void createContrat(MContrat contrat);
    //Lu le compte de society
    public ArrayList<MContrat> readContrat();
    //modification de compte de society
    public void updateContrat(MContrat contrat);
    //suppression de compte
    public void deleteContrat(MContrat contrat);
    
}
