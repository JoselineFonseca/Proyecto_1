
package Negocio;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
import  Modelo.Estudiante;
import Repositorio.EstudianteRepo;
import Excepciones.DatoInvalidoException;
import Excepciones.RegistrosDuplicadosException;

public class EstudianteNegocio {
    private EstudianteRepo repo = new EstudianteRepo();
    
    //metodo para registrar estudiantes con validaciones
        public void registrar(Estudiante e) throws DatoInvalidoException,RegistrosDuplicadosException{ 
            if (e.getNombre() ==null || e.getNombre().length()<3){
                throw new DatoInvalidoException ("El nombre debe tener al menos 3 caracteres ");
            }
            if (e.getEdad()<=0){
                throw new DatoInvalidoException("La edad debe ser mayor que 0");
            }
            if (e.getCorreo()==null||!e.getCorreo().contains("@")){
                throw new DatoInvalidoException("correo inválido");
            }
            if ( e.getCarrera()== null|| e.getCarrera().isEmpty()){
                 throw new DatoInvalidoException("La carrera es obligatoria");
            }
            
            try {
                repo .agregar(e);
            }catch (Exception ex){
                throw new RegistrosDuplicadosException("Ya existe un estudiante con ese correo");
            }  
        }
  //metodo para listar estudiantes     
public java.util.List<Estudiante> listar() {
        return repo.obtenerEstudiantes();
}

 //Método para eliminar esrtudiante
public void eliminar (Estudiante e){
        repo.eliminar(e);
    }  
}
