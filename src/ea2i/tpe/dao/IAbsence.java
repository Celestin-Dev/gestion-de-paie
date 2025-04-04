/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao;

import ea2i.tpe.model.MAbsence;
import java.util.ArrayList;

/**
 *
 * @author CELESTIN
 */
public interface IAbsence {
     //creation de absence
    public void createMAbsence(MAbsence absence);
    //Lecture de absence
    public ArrayList<MAbsence> readMAbsence();
    //modification absence
    public void updateMAbsence(MAbsence absence);
    //suppression absence
    public void deleteMAbsence(MAbsence absence);
}
