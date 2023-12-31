package py.edu.ucom.taller.services;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import py.edu.ucom.taller.config.IDAO;
import py.edu.ucom.taller.entities.Estudiante;
import py.edu.ucom.taller.repositories.EstudianteRepository;

@ApplicationScoped
public class EstudianteService implements IDAO<Estudiante, Integer> {

    private static final Logger LOG = Logger.getLogger(EstudianteService.class);

    @Inject
    private EstudianteRepository repository;

    @Override
    public Estudiante obtener(Integer param) {
        // TODO Auto-generated method stub
        // Estudiante m = new Estudiante(1, "TEST", "TEST");
        return this.repository.findById(param).orElse(null);
    }

    @Override
    public Estudiante agregar(Estudiante param) {
        // TODO Auto-generated method stub
        return this.repository.save(param);
    }

    @Override
    public Estudiante modificar(Estudiante param) {
        // TODO Auto-generated method stub
        return this.repository.save(param);
    }

    @Override
    public void eliminar(Integer param) {
        // TODO Auto-generated method stub
        this.repository.deleteById(param);
    }

    @Override
    public List<Estudiante> listar() {
        return this.repository.findAll();
    }

}