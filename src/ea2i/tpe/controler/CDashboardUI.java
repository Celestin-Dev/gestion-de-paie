/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.controler;

import ea2i.tpe.service.SDashboard;
import ea2i.tpe.view.DashBoardUI;
import ea2i.tpe.view.Employee;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author CELESTIN
 */
public class CDashboardUI {

    public CDashboardUI() {
        DashBoardUI dashBoardUI = new DashBoardUI();
        dashBoardUI.setVisible(true);
        
        //Affichage accueil
        dashBoardUI.getjButtonHome().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SDashboard.changeContentLayout(
                        dashBoardUI.getjPanelParentHome(),
                        dashBoardUI.getHomePage());
            }
        });
        
        //Affichage Employee
        dashBoardUI.getjButtonEmployee().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SDashboard.changeContentLayout(
                        dashBoardUI.getjPanelParentHome(),
                        dashBoardUI.getEmployeePage());
            }
        });
        
        
        //Affichage Paie
        dashBoardUI.getjButtonPaie().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SDashboard.changeContentLayout(
                        dashBoardUI.getjPanelParentHome(),
                        dashBoardUI.getPaie());
            }
        });
        
        //Affihage de presence
        dashBoardUI.getjButtonPresence().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SDashboard.changeContentLayout(
                        dashBoardUI.getjPanelParentHome(),
                        dashBoardUI.getPresence());
            }
        });
        
        //Affichage de Historique
        dashBoardUI.getjButtonHistorique().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SDashboard.changeContentLayout(
                        dashBoardUI.getjPanelParentHome(),
                        dashBoardUI.getHistorique());
            }
        });
        
        
        //Gestion de la bouton de ajout de Employée
        dashBoardUI.getjButtonAddEmployees().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Employee employee = new Employee();
                employee.setVisible(true);
            }
        });
        dashBoardUI.getjButtonAddEmployee2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Employee employee = new Employee();
                employee.setVisible(true);
            }
        });
        
        //
    }
    
    
}
