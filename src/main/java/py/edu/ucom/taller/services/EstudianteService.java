package py.edu.ucom.taller.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import jakarta.enterprise.context.ApplicationScoped;
import py.edu.ucom.taller.entities.Estudiante;
import py.edu.ucom.taller.repositories.EstudianteRepository;

@ApplicationScoped
public class EstudianteService {
    private final EstudianteRepository repository;

    public EstudianteService(EstudianteRepository repository){
        this.repository = repository;
    }
    
    public List<Estudiante> obtenerEstudiante(){
        Stream<Estudiante> data = repository.streamAll();
        List<Estudiante> lista = data
            .collect(Collectors.toList());
        return lista;
    }
    
}
