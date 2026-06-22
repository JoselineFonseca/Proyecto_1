
package Repositorio;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */

import Modelo.Estudiante;
import java.util.*;

public class EstudianteRepo {
     //lista para guardar estudiantes
    private List<Estudiante> estudiantes = new ArrayList<>();
    // set para controlar correos duplicados
    private Set<String> correos = new HashSet <> ();
    
    //metodo para agregar estudiante
    public void agregar(Estudiante e) throws Exception {
        if (correos. contains (e.getCorreo())){
            throw new Exception ("Correo duplicado");
        }
        estudiantes.add(e);
        correos.add(e.getCorreo());
    }
    //metodo para obtener todos los estudiantes
    public List<Estudiante> obtenerEstudiantes(){
        return estudiantes;
    }
    
    //metodo para eliminar estudiantes
    public void eliminar(Estudiante e){
    estudiantes.remove(e);
    correos.remove(e.getCorreo());
    }
}
