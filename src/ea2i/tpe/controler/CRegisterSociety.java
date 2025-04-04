package ea2i.tpe.controler;

import ea2i.tpe.service.SRegistreSociety;
import ea2i.tpe.view.Login;
import ea2i.tpe.view.RegistreSociety;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CRegisterSociety {

    public CRegisterSociety() {

        RegistreSociety registreSociety = new RegistreSociety();
        registreSociety.setVisible(true);

        //annuler la fenêtre
        registreSociety.getjButtonCancel().addActionListener((ActionEvent e) -> {
            registreSociety.dispose();
        });

        //annuler la fenêtre
        registreSociety.getjLabelCancel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                registreSociety.dispose();
            }

        });

        //quiter la fenêtre
        registreSociety.getjLabelClose().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                registreSociety.dispose();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                registreSociety.getjLabelClose().setBackground(new java.awt.Color(2, 62, 81));
                registreSociety.getjLabelClose().setForeground(new java.awt.Color(255, 255, 255));
            }
            

        });

        //retour a la page de connexion
        registreSociety.getjButtonBack().addActionListener((ActionEvent e) -> {
            registreSociety.dispose();
            SRegistreSociety.backToLoginPage();
        });

        //Enregistrer un information de society et l'admin
        registreSociety.getjButtonAddUser().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nameSociety = registreSociety.getjTextFieldNameSociety().getText();
                String domaine = registreSociety.getjTextFieldDomaineSociety().getText();
                String nameUser = registreSociety.getjTextFieldNameUser().getText();
                String password = registreSociety.getjPasswordFieldPassword().getText();
                String confirmPassword = registreSociety.getjPasswordFieldConfirmPasseword().getText();

                if (!nameSociety.isEmpty() | !domaine.isEmpty() | !nameUser.isEmpty() | !password.isEmpty() | !confirmPassword.isEmpty()) {
                    if (!password.equals(confirmPassword)) {
                        JOptionPane.showMessageDialog(null, "Mot de passe inconforme");
                    } else {
                        SRegistreSociety.addAccountSocietyAndAdmin(nameSociety, domaine, nameUser, password);
                        System.out.println("Ajout de compte avec succes");
                        registreSociety.dispose();
                        CLogin cLogin = new CLogin();

                        SRegistreSociety.clearChampText(
                                registreSociety.getjTextFieldNameSociety(),
                                registreSociety.getjTextFieldDomaineSociety(),
                                registreSociety.getjTextFieldNameUser(),
                                registreSociety.getjPasswordFieldPassword(),
                                registreSociety.getjPasswordFieldConfirmPasseword()
                        );

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Veuillez remplir tous champs !");
                }
            }
        });

        //Choisir une photo de profile
        registreSociety.getjButtonSelectPhotoProfil().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon icon = SRegistreSociety.chooserPhotoProfilToFichier(registreSociety.getjTextFieldPhotoProfil());
            }
        });

        //choisir un logo d'entreprise
        registreSociety.getjButtonChooserLogo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon icon = SRegistreSociety.chooserPhotoProfilToFichier();
                registreSociety.getjLabelLogo().setIcon(icon);
            }
        });

    }

}
