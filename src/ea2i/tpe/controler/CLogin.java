/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.controler;

import ea2i.tpe.service.SLogin;
import ea2i.tpe.view.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author CELESTIN
 */
public class CLogin {

    public CLogin() {
        Login login = new Login();
        login.setVisible(true);
        
        login.getjButtonConnectionAdmin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = login.getjTextFieldNameUser().getText();
                String password = login.getjPasswordFieldPassword().getText();
                
                if(username.isEmpty() | password.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Veuillez remplir tous champs");
                }else {
                    boolean status = SLogin.getUser(username, password);
                    if(status){
                        JOptionPane.showMessageDialog(null, "Compte exist!");
                        login.getjTextFieldNameUser().setText("");
                        login.getjPasswordFieldPassword().setText("");
                        login.setVisible(false);
                        login.dispose();
                        new CDashboardUI();
                    }else{
                        JOptionPane.showMessageDialog(null, "Compte n'existe pas !");
                    }
                    
                }
               
            }
        });
        
        
        login.getjLabelCreateAccount().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                login.setVisible(false);
                login.dispose();
                CRegisterSociety registerSociety = new CRegisterSociety();
            }
            
        });
        
        
        login.getClose().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SLogin.closeWindow(login);
            }
        });
    }
    
}
