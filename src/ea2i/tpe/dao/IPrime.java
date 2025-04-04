/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao;

import ea2i.tpe.model.MPrime;
import java.util.ArrayList;

/**
 *
 * @author CELESTIN
 */
public interface IPrime {
    
    //creation de compte dans ce appliction
    public void createPrime(MPrime prime);
    //Lu le compte de society
    public ArrayList<MPrime> readPrime();
    //modification de compte de society
    public void updatePrime(MPrime prime);
    //suppression de compte
    public void deletePrime(MPrime prime);
    
}
