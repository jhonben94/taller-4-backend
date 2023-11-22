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
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 *
 * @author jhony
 */
@Entity
@Table(name = "estudiante")
@NamedQueries({
    @NamedQuery(name = "Estudiante.findAll", query = "SELECT e FROM Estudiante e"),
    @NamedQuery(name = "Estudiante.findByIdEstudiante", query = "SELECT e FROM Estudiante e WHERE e.idEstudiante = :idEstudiante"),
    @NamedQuery(name = "Estudiante.findByNombres", query = "SELECT e FROM Estudiante e WHERE e.nombres = :nombres"),
    @NamedQuery(name = "Estudiante.findByApellidos", query = "SELECT e FROM Estudiante e WHERE e.apellidos = :apellidos"),
    @NamedQuery(name = "Estudiante.findByEdad", query = "SELECT e FROM Estudiante e WHERE e.edad = :edad"),
    @NamedQuery(name = "Estudiante.findBySexo", query = "SELECT e FROM Estudiante e WHERE e.sexo = :sexo")})
public class Estudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_estudiante")
    private Integer idEstudiante;
    @Basic(optional = false)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @Column(name = "edad")
    private int edad;
    @Basic(optional = false)
    @Column(name = "sexo")
    private String sexo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estudiante")
    private List<RegistroAlumnosCurso> registroAlumnosCursoList;

    public Estudiante() {
    }

    public Estudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Estudiante(Integer idEstudiante, String nombres, String apellidos, int edad, String sexo) {
        this.idEstudiante = idEstudiante;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
        hash += (idEstudiante != null ? idEstudiante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        if ((this.idEstudiante == null && other.idEstudiante != null) || (this.idEstudiante != null && !this.idEstudiante.equals(other.idEstudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "py.edu.ucom.taller.entities.Estudiante[ idEstudiante=" + idEstudiante + " ]";
    }
    
}
