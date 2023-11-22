/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.edu.ucom.taller.entities;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author jhony
 */
@Entity
@Table(name = "etapas")
@NamedQueries({
    @NamedQuery(name = "Etapas.findAll", query = "SELECT e FROM Etapas e"),
    @NamedQuery(name = "Etapas.findByIdEtapa", query = "SELECT e FROM Etapas e WHERE e.idEtapa = :idEtapa"),
    @NamedQuery(name = "Etapas.findByRendimiento", query = "SELECT e FROM Etapas e WHERE e.rendimiento = :rendimiento"),
    @NamedQuery(name = "Etapas.findByNivel", query = "SELECT e FROM Etapas e WHERE e.nivel = :nivel"),
    @NamedQuery(name = "Etapas.findByComportamiento", query = "SELECT e FROM Etapas e WHERE e.comportamiento = :comportamiento")})
public class Etapas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_etapa")
    private Integer idEtapa;
    @Column(name = "rendimiento")
    private Integer rendimiento;
    @Column(name = "nivel")
    private Integer nivel;
    @Column(name = "comportamiento")
    private Integer comportamiento;

    public Etapas() {
    }

    public Etapas(Integer idEtapa) {
        this.idEtapa = idEtapa;
    }

    public Integer getIdEtapa() {
        return idEtapa;
    }

    public void setIdEtapa(Integer idEtapa) {
        this.idEtapa = idEtapa;
    }

    public Integer getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(Integer rendimiento) {
        this.rendimiento = rendimiento;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(Integer comportamiento) {
        this.comportamiento = comportamiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEtapa != null ? idEtapa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etapas)) {
            return false;
        }
        Etapas other = (Etapas) object;
        if ((this.idEtapa == null && other.idEtapa != null) || (this.idEtapa != null && !this.idEtapa.equals(other.idEtapa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "py.edu.ucom.taller.entities.Etapas[ idEtapa=" + idEtapa + " ]";
    }
    
}
