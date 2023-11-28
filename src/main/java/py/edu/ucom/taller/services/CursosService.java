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
import py.edu.ucom.taller.entities.Cursos;
import py.edu.ucom.taller.repositories.CursosRepository;

@ApplicationScoped
public class CursosService implements IDAO<Cursos, Integer> {

    private static final Logger LOG = Logger.getLogger(CursosService.class);

    @Inject
    private CursosRepository repository;

    @Override
    public Cursos obtener(Integer param) {
        // TODO Auto-generated method stub
        // Cursos m = new Cursos(1, "TEST", "TEST");
        return this.repository.findById(param).orElse(null);
    }

    @Override
    public Cursos agregar(Cursos param) {
        // TODO Auto-generated method stub
        return this.repository.save(param);
    }

    @Override
    public Cursos modificar(Cursos param) {
        // TODO Auto-generated method stub
        return this.repository.save(param);
    }

    @Override
    public void eliminar(Integer param) {
        // TODO Auto-generated method stub
        this.repository.deleteById(param);
    }

    @Override
    public List<Cursos> listar() {
        return this.repository.findAll();
    }

    public List<Cursos> listarCursosPorDocente(Integer idDocente, Integer idEntidadEducativa) {

        return this.repository.obtenerCursosPorDocente(idDocente, idEntidadEducativa);
    } 

}