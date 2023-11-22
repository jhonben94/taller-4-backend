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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 *
 * @author jhony
 */
@Entity
@Table(name = "cursos")
@NamedQueries({
    @NamedQuery(name = "Cursos.findAll", query = "SELECT c FROM Cursos c"),
    @NamedQuery(name = "Cursos.findByIdCurso", query = "SELECT c FROM Cursos c WHERE c.idCurso = :idCurso"),
    @NamedQuery(name = "Cursos.findByCodigo", query = "SELECT c FROM Cursos c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Cursos.findByAnio", query = "SELECT c FROM Cursos c WHERE c.anio = :anio"),
    @NamedQuery(name = "Cursos.findByDescripcion", query = "SELECT c FROM Cursos c WHERE c.descripcion = :descripcion")})
public class Cursos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_curso")
    private Integer idCurso;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "anio")
    private int anio;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "id_docente", referencedColumnName = "id_docente")
    @ManyToOne(optional = false)
    private Docente idDocente;
    @JoinColumn(name = "id_entidad_educativa", referencedColumnName = "id_entidad_educativa")
    @ManyToOne(optional = false)
    private EntidadEducativa idEntidadEducativa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCurso")
    private List<Seccion> seccionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cursos")
    private List<RegistroAlumnosCurso> registroAlumnosCursoList;

    public Cursos() {
    }

    public Cursos(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Cursos(Integer idCurso, String codigo, int anio, String descripcion) {
        this.idCurso = idCurso;
        this.codigo = codigo;
        this.anio = anio;
        this.descripcion = descripcion;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Docente getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Docente idDocente) {
        this.idDocente = idDocente;
    }

    public EntidadEducativa getIdEntidadEducativa() {
        return idEntidadEducativa;
    }

    public void setIdEntidadEducativa(EntidadEducativa idEntidadEducativa) {
        this.idEntidadEducativa = idEntidadEducativa;
    }

    public List<Seccion> getSeccionList() {
        return seccionList;
    }

    public void setSeccionList(List<Seccion> seccionList) {
        this.seccionList = seccionList;
    }

    public List<RegistroAlumnosCurso> getRegistroAlumnosCursoList() {
        return registroAlumnosCursoList;
    }

    public void setRegistroAlumnosCursoList(List<RegistroAlumnosCurso> registroAlumnosCursoList) {
        this.registroAlumnosCursoList = registroAlumnosCursoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCurso != null ? idCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cursos)) {
            return false;
        }
        Cursos other = (Cursos) object;
        if ((this.idCurso == null && other.idCurso != null) || (this.idCurso != null && !this.idCurso.equals(other.idCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "py.edu.ucom.taller.entities.Cursos[ idCurso=" + idCurso + " ]";
    }
    
}
