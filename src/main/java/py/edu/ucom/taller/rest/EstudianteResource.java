package py.edu.ucom.taller.rest;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import py.edu.ucom.taller.entities.Estudiante;
import py.edu.ucom.taller.services.EstudianteService;

/**
 * EstudianteResource
 */
@Path("estudiante")
public class EstudianteResource {

    private EstudianteService service;

    public EstudianteResource(EstudianteService service){
        this.service= service;
    }
    
    @GET
    public List<Estudiante> obtenerEntity(){
        return service.obtenerEstudiante();
    }

    
}