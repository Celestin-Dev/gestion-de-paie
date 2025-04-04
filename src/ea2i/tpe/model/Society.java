/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.model;

/**
 *
 * @author CELESTIN
 */
public class Society {
    
    private int id;
    private String name;
    private String domaine;
    private String email;
    private String logo;
    private String password;
    
    public Society() {
    }
    
    public Society(String name, String domaine, String email, String logo, String password) {
        this.name = name;
        this.domaine = domaine;
        this.email = email;
        this.logo = logo;
        this.password = password;
    }

    public Society(int id, String name, String domaine, String email, String logo, String password) {
        this.id = id;
        this.name = name;
        this.domaine = domaine;
        this.email = email;
        this.logo = logo;
        this.password = password;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }  

}
