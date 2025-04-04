
package ea2i.tpe.service;

import ea2i.tpe.controler.CLogin;
import ea2i.tpe.dao.sqlite.SocietyDAO;
import ea2i.tpe.model.Society;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SRegistreSociety {
    
    //retour en arrieur
    public static void backToLoginPage(){
        CLogin cLogin = new CLogin();
        
    }
    
    
    //Ajouter une information de society dans une base de donnée
    public static void addAccountSocietyAndAdmin(String nameSociety, String domaine, String nameUser, String password) {
        SocietyDAO dao = new SocietyDAO();
        Society society = new Society(nameUser, domaine, nameUser, domaine, password);
        dao.createSociety(society);
    }

    //Effacer le zone de text
    public static void clearChampText(JTextField jTextFieldNameSociety, JTextField jTextFieldDomaineSociety, JTextField jTextFieldNameUser, JPasswordField jPasswordFieldPassword, JPasswordField jPasswordFieldConfirmPasseword) {
        jTextFieldNameSociety.setText("");
        jTextFieldDomaineSociety.setText("");
        jTextFieldNameUser.setText("");
        jPasswordFieldPassword.setText("");
        jPasswordFieldConfirmPasseword.setText("");
    }
    
    
    //choisir une image dans le fichier
    public static ImageIcon chooserPhotoProfilToFichier(JTextField chemin) {
        JFileChooser pic = new JFileChooser();
        pic.showOpenDialog(null);
        File path = pic.getSelectedFile();
        String c = pic.getDescription(path);
        chemin.setText(c);
        System.out.println(c);
        BufferedImage img;
        ImageIcon icon = null;
        try {
            img = ImageIO.read(path);
            icon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        } catch (IOException ex) {
            Logger.getLogger(SRegistreSociety.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return icon;
        
    }
    
    
    //choisir une image dans le fichier
    public static ImageIcon chooserPhotoProfilToFichier() {
        JFileChooser pic = new JFileChooser();
        pic.showOpenDialog(null);
        File path = pic.getSelectedFile();
        String c = pic.getDescription(path);
        System.out.println(c);
        BufferedImage img;
        ImageIcon icon = null;
        try {
            img = ImageIO.read(path);
            icon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(92, 115, Image.SCALE_DEFAULT));
        } catch (IOException ex) {
            Logger.getLogger(SRegistreSociety.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return icon;
        
    }
    
}
