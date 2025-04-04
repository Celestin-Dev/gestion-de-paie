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
public class MAbsence {
    private Long idAbsence;
    private Long idEmployee;
    private String typeAbsence;
    private Date dateDebut;
    private Date dateFin;

    public MAbsence() {
    }

    public MAbsence(Long idEmployee, String typeAbsence, Date dateDebut, Date dateFin) {
        this.idEmployee = idEmployee;
        this.typeAbsence = typeAbsence;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public MAbsence(Long idAbsence, Long idEmployee, String typeAbsence, Date dateDebut, Date dateFin) {
        this.idAbsence = idAbsence;
        this.idEmployee = idEmployee;
        this.typeAbsence = typeAbsence;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Long getIdAbsence() {
        return idAbsence;
    }

    public void setIdAbsence(Long idAbsence) {
        this.idAbsence = idAbsence;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getTypeAbsence() {
        return typeAbsence;
    }

    public void setTypeAbsence(String typeAbsence) {
        this.typeAbsence = typeAbsence;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
    
    
}
