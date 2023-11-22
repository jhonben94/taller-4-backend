/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package py.edu.ucom.taller.entities;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 *
 * @author jhony
 */
@Embeddable
public class RegistroAlumnosCursoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_curso")
    private int idCurso;
    @Basic(optional = false)
    @Column(name = "id_estudiante")
    private int idEstudiante;

    public RegistroAlumnosCursoPK() {
    }

    public RegistroAlumnosCursoPK(int idCurso, int idEstudiante) {
        this.idCurso = idCurso;
        this.idEstudiante = idEstudiante;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCurso;
        hash += (int) idEstudiante;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroAlumnosCursoPK)) {
            return false;
        }
        RegistroAlumnosCursoPK other = (RegistroAlumnosCursoPK) object;
        if (this.idCurso != other.idCurso) {
            return false;
        }
        if (this.idEstudiante != other.idEstudiante) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "py.edu.ucom.taller.entities.RegistroAlumnosCursoPK[ idCurso=" + idCurso + ", idEstudiante=" + idEstudiante + " ]";
    }
    
}
