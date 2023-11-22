package py.edu.ucom.taller.repositories;

import py.edu.ucom.taller.entities.MyEntity;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class  MyEntityRepository implements PanacheRepository<MyEntity> {
    
}
