package py.edu.ucom.taller.services;

import jakarta.enterprise.context.ApplicationScoped;
import py.edu.ucom.taller.entities.Estudiante;
import py.edu.ucom.taller.entities.RegistroAlumnosCurso;
import py.edu.ucom.taller.entities.RegistroAlumnosCursoPK;
import py.edu.ucom.taller.params.AltaEstudianteCursoParam;
import py.edu.ucom.taller.repositories.EstudianteRepository;
import py.edu.ucom.taller.repositories.RegistroAlumnosCursoRepository;

import javax.crypto.spec.PBEKeySpec;

import org.jboss.logging.Logger;

/**
 *
 * @author jhony
 */
@ApplicationScoped
public class RegistroAlumnoCursoService {
        private static final Logger LOG = Logger.getLogger(RegistroAlumnoCursoService.class);

        private RegistroAlumnosCursoRepository repository;
        private EstudianteRepository repositoryEstudiante;

        public RegistroAlumnoCursoService(RegistroAlumnosCursoRepository repository,
                        EstudianteRepository repositoryEstudiante) {
                this.repository = repository;
                this.repositoryEstudiante= repositoryEstudiante;
        }

        public RegistroAlumnosCurso procesoAltaEstudianteCurso(AltaEstudianteCursoParam param) {
                RegistroAlumnosCurso racData =null;
                try {
                    Estudiante e = new Estudiante();
                    e.setNombres(param.getNombre());
                    e.setApellidos(param.getApellido());
                    e.setEdad(param.getEdad());
                    e.setSexo(param.getSexo());
                    this.repositoryEstudiante.save(e);
                    LOG.info(e);
                    RegistroAlumnosCursoPK pk = new RegistroAlumnosCursoPK();
                    pk.setIdCurso(param.getIdCurso());
                    pk.setIdEstudiante( e.getIdEstudiante() );
                    LOG.info(pk);   

                    racData = new RegistroAlumnosCurso();
                    racData.setRegistroAlumnosCursoPK(pk);
                    racData.setNota(0);
                    this.repository.save(racData);

                } catch (Exception e) {
                        e.printStackTrace();
                }

                return racData;
        }
}
