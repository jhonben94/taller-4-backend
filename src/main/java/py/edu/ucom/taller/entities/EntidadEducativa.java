/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.edu.ucom.taller.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 *
 * @author jhony
 */
@Entity
@Table(name = "entidad_educativa")
@NamedQueries({
    @NamedQuery(name = "EntidadEducativa.findAll", query = "SELECT e FROM EntidadEducativa e"),
    @NamedQuery(name = "EntidadEducativa.findByIdEntidadEducativa", query = "SELECT e FROM EntidadEducativa e WHERE e.idEntidadEducativa = :idEntidadEducativa"),
    @NamedQuery(name = "EntidadEducativa.findByNombre", query = "SELECT e FROM EntidadEducativa e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "EntidadEducativa.findByDireccion", query = "SELECT e FROM EntidadEducativa e WHERE e.direccion = :direccion"),
    @NamedQuery(name = "EntidadEducativa.findByTelefono", query = "SELECT e FROM EntidadEducativa e WHERE e.telefono = :telefono")})
public class EntidadEducativa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_entidad_educativa")
    private Integer idEntidadEducativa;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @ManyToMany(mappedBy = "entidadEducativaList")
    private List<Docente> docenteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEntidadEducativa")
    private List<Cursos> cursosList;

    public EntidadEducativa() {
    }

    public EntidadEducativa(Integer idEntidadEducativa) {
        this.idEntidadEducativa = idEntidadEducativa;
    }

    public EntidadEducativa(Integer idEntidadEducativa, String nombre, String direccion, String telefono) {
        this.idEntidadEducativa = idEntidadEducativa;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Integer getIdEntidadEducativa() {
        return idEntidadEducativa;
    }

    public void setIdEntidadEducativa(Integer idEntidadEducativa) {
        this.idEntidadEducativa = idEntidadEducativa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Docente> getDocenteList() {
        return docenteList;
    }

    public void setDocenteList(List<Docente> docenteList) {
        this.docenteList = docenteList;
    }

    public List<Cursos> getCursosList() {
        return cursosList;
    }

    public void setCursosList(List<Cursos> cursosList) {
        this.cursosList = cursosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntidadEducativa != null ? idEntidadEducativa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntidadEducativa)) {
            return false;
        }
        EntidadEducativa other = (EntidadEducativa) object;
        if ((this.idEntidadEducativa == null && other.idEntidadEducativa != null) || (this.idEntidadEducativa != null && !this.idEntidadEducativa.equals(other.idEntidadEducativa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "py.edu.ucom.taller.entities.EntidadEducativa[ idEntidadEducativa=" + idEntidadEducativa + " ]";
    }
    
}
