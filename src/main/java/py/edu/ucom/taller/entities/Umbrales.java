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
@Table(name = "umbrales")
@NamedQueries({
    @NamedQuery(name = "Umbrales.findAll", query = "SELECT u FROM Umbrales u"),
    @NamedQuery(name = "Umbrales.findByIdUmbral", query = "SELECT u FROM Umbrales u WHERE u.idUmbral = :idUmbral"),
    @NamedQuery(name = "Umbrales.findByDescripcion", query = "SELECT u FROM Umbrales u WHERE u.descripcion = :descripcion")})
public class Umbrales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_umbral")
    private Integer idUmbral;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;

    public Umbrales() {
    }

    public Umbrales(Integer idUmbral) {
        this.idUmbral = idUmbral;
    }

    public Umbrales(Integer idUmbral, String descripcion) {
        this.idUmbral = idUmbral;
        this.descripcion = descripcion;
    }

    public Integer getIdUmbral() {
        return idUmbral;
    }

    public void setIdUmbral(Integer idUmbral) {
        this.idUmbral = idUmbral;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUmbral != null ? idUmbral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Umbrales)) {
            return false;
        }
        Umbrales other = (Umbrales) object;
        if ((this.idUmbral == null && other.idUmbral != null) || (this.idUmbral != null && !this.idUmbral.equals(other.idUmbral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "py.edu.ucom.taller.entities.Umbrales[ idUmbral=" + idUmbral + " ]";
    }
    
}
