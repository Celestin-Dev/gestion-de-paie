
package ea2i.tpe.model;

/**
 *
 * @author CELESTIN
 */
public class MBulletinPaie {
    private Long id_paie;
    private Long id_employee;
    private Double salaire_brut;
    private Double salaire_net;

    public MBulletinPaie() {
    }

    public MBulletinPaie(Long id_employee, Double salaire_brut, Double salaire_net) {
        this.id_employee = id_employee;
        this.salaire_brut = salaire_brut;
        this.salaire_net = salaire_net;
    }

    public MBulletinPaie(Long id_paie, Long id_employee, Double salaire_brut, Double salaire_net) {
        this.id_paie = id_paie;
        this.id_employee = id_employee;
        this.salaire_brut = salaire_brut;
        this.salaire_net = salaire_net;
    }

    public Double getSalaire_net() {
        return salaire_net;
    }

    public void setSalaire_net(Double salaire_net) {
        this.salaire_net = salaire_net;
    }

    public Long getId_paie() {
        return id_paie;
    }

    public void setId_paie(Long id_paie) {
        this.id_paie = id_paie;
    }

    public Long getId_employee() {
        return id_employee;
    }

    public void setId_employee(Long id_employee) {
        this.id_employee = id_employee;
    }

    public Double getSalaire_brut() {
        return salaire_brut;
    }

    public void setSalaire_brut(Double salaire_brut) {
        this.salaire_brut = salaire_brut;
    }
    
    
}
