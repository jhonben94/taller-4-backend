package py.edu.ucom.taller.repositories;

import jakarta.enterprise.context.ApplicationScoped;
import py.edu.ucom.taller.entities.Estudiante;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class EstudianteRepository  implements PanacheRepository<Estudiante>  {
    
}
