/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.edu.ucom.taller.entities;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author jhony
 */
@Entity
@Table(name = "registro_alumnos_curso")
@NamedQueries({
    @NamedQuery(name = "RegistroAlumnosCurso.findAll", query = "SELECT r FROM RegistroAlumnosCurso r"),
    @NamedQuery(name = "RegistroAlumnosCurso.findByIdCurso", query = "SELECT r FROM RegistroAlumnosCurso r WHERE r.registroAlumnosCursoPK.idCurso = :idCurso"),
    @NamedQuery(name = "RegistroAlumnosCurso.findByIdEstudiante", query = "SELECT r FROM RegistroAlumnosCurso r WHERE r.registroAlumnosCursoPK.idEstudiante = :idEstudiante"),
    @NamedQuery(name = "RegistroAlumnosCurso.findByNota", query = "SELECT r FROM RegistroAlumnosCurso r WHERE r.nota = :nota")})
public class RegistroAlumnosCurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RegistroAlumnosCursoPK registroAlumnosCursoPK;
    @Column(name = "nota")
    private Integer nota;
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cursos cursos;
    @JoinColumn(name = "id_estudiante", referencedColumnName = "id_estudiante", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Estudiante estudiante;

    public RegistroAlumnosCurso() {
    }

    public RegistroAlumnosCurso(RegistroAlumnosCursoPK registroAlumnosCursoPK) {
        this.registroAlumnosCursoPK = registroAlumnosCursoPK;
    }

    public RegistroAlumnosCurso(int idCurso, int idEstudiante) {
        this.registroAlumnosCursoPK = new RegistroAlumnosCursoPK(idCurso, idEstudiante);
    }

    public RegistroAlumnosCursoPK getRegistroAlumnosCursoPK() {
        return registroAlumnosCursoPK;
    }

    public void setRegistroAlumnosCursoPK(RegistroAlumnosCursoPK registroAlumnosCursoPK) {
        this.registroAlumnosCursoPK = registroAlumnosCursoPK;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (registroAlumnosCursoPK != null ? registroAlumnosCursoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroAlumnosCurso)) {
            return false;
        }
        RegistroAlumnosCurso other = (RegistroAlumnosCurso) object;
        if ((this.registroAlumnosCursoPK == null && other.registroAlumnosCursoPK != null) || (this.registroAlumnosCursoPK != null && !this.registroAlumnosCursoPK.equals(other.registroAlumnosCursoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "py.edu.ucom.taller.entities.RegistroAlumnosCurso[ registroAlumnosCursoPK=" + registroAlumnosCursoPK + " ]";
    }
    
}
