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
public class MCotisation {
    private Long id_cotisation;
    private Long id_employee;
    private String type_cotisation;
    private Double montant;

    public MCotisation() {
    }

    public MCotisation(Long id_employee, String type_cotisation, Double montant) {
        this.id_employee = id_employee;
        this.type_cotisation = type_cotisation;
        this.montant = montant;
    }

    public MCotisation(Long id_cotisation, Long id_employee, String type_cotisation, Double montant) {
        this.id_cotisation = id_cotisation;
        this.id_employee = id_employee;
        this.type_cotisation = type_cotisation;
        this.montant = montant;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Long getId_cotisation() {
        return id_cotisation;
    }

    public void setId_cotisation(Long id_cotisation) {
        this.id_cotisation = id_cotisation;
    }

    public Long getId_employee() {
        return id_employee;
    }

    public void setId_employee(Long id_employee) {
        this.id_employee = id_employee;
    }

    public String getType_cotisation() {
        return type_cotisation;
    }

    public void setType_cotisation(String type_cotisation) {
        this.type_cotisation = type_cotisation;
    }
    
    
}
