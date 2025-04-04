/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.model;

import java.sql.Date;

/**
 *
 * @author CELESTIN
 */
public class MEmployee {
    
    private long id_employee;//clé primaire dans la base et incrementation automatique
    private String name;
    private String firstName;
    private Date birthday;
    private String address;
    private String numero;
    private String poste;
    
    public MEmployee(){
        
    }

    public MEmployee(long id_employee, String name, String firstName, Date birthday, String address, String numero, String poste) {
        this.id_employee = id_employee;
        this.name = name;
        this.firstName = firstName;
        this.birthday = birthday;
        this.address = address;
        this.numero = numero;
        this.poste = poste;
    }

    public MEmployee(String name, String firstName, Date birthday, String address, String numero, String poste) {
        this.name = name;
        this.firstName = firstName;
        this.birthday = birthday;
        this.address = address;
        this.numero = numero;
        this.poste = poste;
    }
    
    public MEmployee(long id_employee, String name, String firstName) {
        this.id_employee = id_employee;
        this.name = name;
        this.firstName = firstName;
    }

    public long getId_employee() {
        return id_employee;
    }

    public void setId_employee(long id_employee) {
        this.id_employee = id_employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }  
    
}
