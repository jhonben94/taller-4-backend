package py.edu.ucom.taller.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import jakarta.enterprise.context.ApplicationScoped;
import py.edu.ucom.taller.entities.MyEntity;
import py.edu.ucom.taller.repositories.MyEntityRepository;

@ApplicationScoped
public class MyentityService {
    private final MyEntityRepository repository;

    public MyentityService(MyEntityRepository repository){
        this.repository = repository;
    }
    
    public List<MyEntity> obtenerMyEntity(){
        Stream<MyEntity> data = repository.streamAll();
        List<MyEntity> lista = data
            .collect(Collectors.toList());
        return lista;
    }
    
}
