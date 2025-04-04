/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea2i.tpe.model;

import java.util.Date;

/**
 *
 * @author CELESTIN
 */
public class MContrat {
    
    private Long id;
    private Long id_employe;
    private String type_contrat;
    private Date debut_contrat;
    private Date fin_contrat;
    private Double salaire;

    public MContrat() {
    }

    public MContrat(Long id_employe, String type_contrat, Date debut_contrat, Date fin_contrat, Double salaire) {
        this.id_employe = id_employe;
        this.type_contrat = type_contrat;
        this.debut_contrat = debut_contrat;
        this.fin_contrat = fin_contrat;
        this.salaire = salaire;
    }

    public MContrat(Long id, Long id_employe, String type_contrat, Date debut_contrat, Date fin_contrat, Double salaire) {
        this.id = id;
        this.id_employe = id_employe;
        this.type_contrat = type_contrat;
        this.debut_contrat = debut_contrat;
        this.fin_contrat = fin_contrat;
        this.salaire = salaire;
    }
    
    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    public Long getId_employe() {
        return id_employe;
    }

    public void setId_employe(Long id_employe) {
        this.id_employe = id_employe;
    }

    public String getType_contrat() {
        return type_contrat;
    }

    public void setType_contrat(String type_contrat) {
        this.type_contrat = type_contrat;
    }

    public Date getDebut_contrat() {
        return debut_contrat;
    }

    public void setDebut_contrat(Date debut_contrat) {
        this.debut_contrat = debut_contrat;
    }

    public Date getFin_contrat() {
        return fin_contrat;
    }

    public void setFin_contrat(Date fin_contrat) {
        this.fin_contrat = fin_contrat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
