/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.service;

import ea2i.tpe.dao.sqlite.SocietyDAO;
import ea2i.tpe.model.Society;
import ea2i.tpe.view.Login;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.text.View;

/**
 *
 * @author CELESTIN
 */
public class SLogin {
    
    //Verification que ce compte existe ou pas
    public static Boolean getUser(String username, String password){
        ArrayList<Society> user = new ArrayList<>();
        SocietyDAO dao = new SocietyDAO();
        user = dao.readSociety();
        Boolean status = false;
        for(Society temp : user){
            if(temp.getEmail().trim().equals(username) & temp.getPassword().trim().equals(password)){
                System.out.println("User exist !");
                status = true;
            }
        }
        return status;
        
    }
    
    //close feêtre
    public static void closeWindow(Login log){
        log.dispose();
    }
}
