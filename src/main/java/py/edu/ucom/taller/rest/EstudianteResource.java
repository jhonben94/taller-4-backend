package py.edu.ucom.taller.rest;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;
import py.edu.ucom.taller.config.Globales;
import py.edu.ucom.taller.entities.Estudiante;
import py.edu.ucom.taller.params.AltaEstudianteCursoParam;
import py.edu.ucom.taller.services.EstudianteService;
import py.edu.ucom.taller.services.RegistroAlumnoCursoService;

@Path("/estudiante")
public class EstudianteResource {
    
    @Inject
    public EstudianteService service;
    @Inject
    public RegistroAlumnoCursoService serviceAlta;
    @GET
    public List<Estudiante> listar(){
        return this.service.listar();
    }
    @DELETE
    @Path("{id}")
    public void eliminar(Integer id) {
        this.service.eliminar(id);
    }
    @POST
    public Estudiante agregar (Estudiante param){
        return this.service.agregar(param);
    }
    @PUT
    public Estudiante modificar (Estudiante param){
        return this.service.modificar(param);
    }
    @GET
    @Path("{id}")
    public Response obtener(@PathParam("id")Integer param) throws Exception{
        Estudiante entity = this.service.obtener(param);
       
        return Response.ok(entity).build();     
    }
    @POST
    @Path("proceso-alta")
    public Response procesoAltaEstudiante (AltaEstudianteCursoParam param){
        
        return Response.ok(this.serviceAlta.procesoAltaEstudianteCurso(param)).build();     
    }
}
