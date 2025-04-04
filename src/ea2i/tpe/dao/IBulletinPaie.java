/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao;

import ea2i.tpe.model.MBulletinPaie;
import java.util.ArrayList;

/**
 *
 * @author CELESTIN
 */
public interface IBulletinPaie {
    //creation de MBulletin de Paie
    public void createMBulletinPaie(MBulletinPaie bulletiPaie);
    //Lecture de la Bulletin de Paie
    public ArrayList<MBulletinPaie> readMBulletinPaie();
    //modification Bulletin de Paie
    public void updateMBulletinPaie(MBulletinPaie bulletiPaie);
    //suppression Bulletin de Paie
    public void deleteMBulletinPaie(MBulletinPaie bulletiPaie);
}
