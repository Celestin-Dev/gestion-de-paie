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
public class MPrime {
    
    private Long id_prime;
    private Long id_employee;
    private String type_prime;
    private Double montant_prime;

    public MPrime() {
    }

    public MPrime(Long id_prime, Long id_employee, String type_prime, Double montant_prime) {
        this.id_prime = id_prime;
        this.id_employee = id_employee;
        this.type_prime = type_prime;
        this.montant_prime = montant_prime;
    }

    public MPrime(Long id_employee, String type_prime, Double montant_prime) {
        this.id_employee = id_employee;
        this.type_prime = type_prime;
        this.montant_prime = montant_prime;
    }

    public Double getMontant_prime() {
        return montant_prime;
    }

    public void setMontant_prime(Double montant_prime) {
        this.montant_prime = montant_prime;
    }

    public Long getId_prime() {
        return id_prime;
    }

    public void setId_prime(Long id_prime) {
        this.id_prime = id_prime;
    }

    public Long getId_employee() {
        return id_employee;
    }

    public void setId_employee(Long id_employee) {
        this.id_employee = id_employee;
    }

    public String getType_prime() {
        return type_prime;
    }

    public void setType_prime(String type_prime) {
        this.type_prime = type_prime;
    }
    
    
    
}
