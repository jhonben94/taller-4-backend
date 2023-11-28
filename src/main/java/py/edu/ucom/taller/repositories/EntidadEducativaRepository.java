package py.edu.ucom.taller.repositories;
import py.edu.ucom.taller.entities.EntidadEducativa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntidadEducativaRepository  extends JpaRepository<EntidadEducativa,Integer> {
    
}
