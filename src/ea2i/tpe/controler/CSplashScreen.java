/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.controler;

import ea2i.tpe.view.SplashScreen;

/**
 *
 * @author CELESTIN
 */
public class CSplashScreen {

    public CSplashScreen() {
        SplashScreen splashScreen = new SplashScreen();
        splashScreen.setVisible(true);
        
        try {
            for(int x = 0; x < 101; x++){
            Thread.sleep(110);
            splashScreen.getjProgressBarSplashScreen().setValue(x);
            if(x==100){
                splashScreen.dispose();
                CLogin login = new CLogin();
            }
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    
    
}
