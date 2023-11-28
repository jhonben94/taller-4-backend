package py.edu.ucom.taller.repositories;
import py.edu.ucom.taller.entities.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteRepository  extends JpaRepository<Docente,Integer> {
    
}
