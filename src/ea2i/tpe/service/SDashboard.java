/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.service;

import javax.swing.JPanel;

/**
 *
 * @author CELESTIN
 */
public class SDashboard {
    
    public static void changeContentLayout(JPanel parent, JPanel value){
        parent.removeAll();
        parent.add(value);
        parent.repaint();
        parent.revalidate();
    }
    
}
