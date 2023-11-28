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
import py.edu.ucom.taller.entities.Cursos;
import py.edu.ucom.taller.services.CursosService;

@Path("/cursos")
public class CursosResource {
    
    @Inject
    public CursosService service;

    @GET
    public List<Cursos> listar(){
        return this.service.listar();
    }
    @DELETE
    @Path("{id}")
    public void eliminar(Integer id) {
        this.service.eliminar(id);
    }
    @POST
    public Cursos agregar (Cursos param){
        return this.service.agregar(param);
    }
    @PUT
    public Cursos modificar (Cursos param){
        return this.service.modificar(param);
    }
    @GET
    @Path("{id}")
    public Response obtener(@PathParam("id")Integer param) throws Exception{
        Cursos entity = this.service.obtener(param);
       
        return Response.ok(entity).build();     
    }
    @GET
    @Path("/{idDocente}/{idEE}")
    public Response obtener(@PathParam("idDocente")Integer param, @PathParam("idEE")Integer param2 ) throws Exception{
        List<Cursos> entity = this.service.listarCursosPorDocente(param,param2);
       
        return Response.ok(entity).build();     
    }
}
