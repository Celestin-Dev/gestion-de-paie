/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.dao;

import ea2i.tpe.model.MAvantages;
import java.util.ArrayList;

/**
 *
 * @author CELESTIN
 */
public interface IAvantages {
    //creation de avantage
    public void createAvantages(MAvantages avantage);
    //Lu le compte de avantage
    public ArrayList<MAvantages> readAvantages();
    //modification avantage
    public void updateAvantages(MAvantages avantage);
    //suppression avantage
    public void deleteAvantages(MAvantages avantage);
}
