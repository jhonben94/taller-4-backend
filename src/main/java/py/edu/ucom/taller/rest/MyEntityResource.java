package py.edu.ucom.taller.rest;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import py.edu.ucom.taller.entities.MyEntity;
import py.edu.ucom.taller.services.MyentityService;

/**
 * MyEntityResource
 */
@Path("my-entity")
public class MyEntityResource {

    private MyentityService service;

    public MyEntityResource(MyentityService service){
        this.service= service;
    }
    
    @GET
    public List<MyEntity> obtenerEntity(){
        return service.obtenerMyEntity();
    }

    
}