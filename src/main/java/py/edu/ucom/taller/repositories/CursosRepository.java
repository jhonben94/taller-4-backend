package py.edu.ucom.taller.repositories;

import java.util.List;

import py.edu.ucom.taller.entities.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface CursosRepository  extends JpaRepository<Cursos,Integer> {

    @Query("SELECT e FROM Cursos e WHERE e.idDocente.idDocente = :idDocente  AND e.idEntidadEducativa.idEntidadEducativa = :idEntidadEducativa " )

    List<Cursos> obtenerCursosPorDocente(Integer idDocente, Integer idEntidadEducativa);
    
}
