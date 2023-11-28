package py.edu.ucom.taller.repositories;
import py.edu.ucom.taller.entities.Seccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeccionRepository  extends JpaRepository<Seccion,Integer> {
    
}
