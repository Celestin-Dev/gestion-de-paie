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
public class MAvantages {
    private Long id_avantage;
    private Long id_employee;
    private String type_avantage;
    private Double montant_avantage;

    public MAvantages() {
    }

    public MAvantages(Long id_employee, String type_avantage, Double montant_avantage) {
        this.id_employee = id_employee;
        this.type_avantage = type_avantage;
        this.montant_avantage = montant_avantage;
    }

    public MAvantages(Long id_avantage, Long id_employee, String type_avantage, Double montant_avantage) {
        this.id_avantage = id_avantage;
        this.id_employee = id_employee;
        this.type_avantage = type_avantage;
        this.montant_avantage = montant_avantage;
    }

    public Double getMontant_avantage() {
        return montant_avantage;
    }

    public void setMontant_avantage(Double montant_avantage) {
        this.montant_avantage = montant_avantage;
    }

    public Long getId_avantage() {
        return id_avantage;
    }

    public void setId_avantage(Long id_avantage) {
        this.id_avantage = id_avantage;
    }

    public Long getId_employee() {
        return id_employee;
    }

    public void setId_employee(Long id_employee) {
        this.id_employee = id_employee;
    }

    public String getType_avantage() {
        return type_avantage;
    }

    public void setType_avantage(String type_avantage) {
        this.type_avantage = type_avantage;
    }
    
    
}
