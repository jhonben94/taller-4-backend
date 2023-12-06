package py.edu.ucom.taller.repositories;
import py.edu.ucom.taller.entities.Estudiante;
import py.edu.ucom.taller.entities.RegistroAlumnosCurso;
import py.edu.ucom.taller.entities.RegistroAlumnosCursoPK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroAlumnosCursoRepository  extends JpaRepository<RegistroAlumnosCurso,RegistroAlumnosCursoPK> {
    
}
