package py.edu.ucom.taller.repositories;
import py.edu.ucom.taller.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository  extends JpaRepository<Estudiante,Integer> {
    
}
