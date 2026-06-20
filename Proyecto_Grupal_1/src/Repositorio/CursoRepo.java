/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

/**
 *
 * @author Geirel
 */
import Modelo.Curso;
import java.util.*;

public class CursoRepo {
    
    private List<Curso> cursos = new ArrayList<>();
    private Set<String> codigos = new HashSet <> ();
    
    //Registrar curso
    public void agregar(Curso curso) {
        cursos.add(curso);
        codigos.add(curso.getCodigo());
    }
    
    //Editar Cursos
    public boolean editar(Curso cursoActualizado) {

        for (int i = 0; i < cursos.size(); i++) {

            if (cursos.get(i).getCodigo()
                    .equalsIgnoreCase(cursoActualizado.getCodigo())) {

                cursos.set(i, cursoActualizado);
                return true;
            }
        }
        return false;
    }

    //Eliminar curso por código
    public boolean eliminar(String codigo) {
        Iterator<Curso> it = cursos.iterator();
        while (it.hasNext()) {
            Curso curso = it.next();
            if (curso.getCodigo().equalsIgnoreCase(codigo)) {
                it.remove();
                codigos.remove(codigo);
                return true;
            }
        }
        return false;
    }
    
    //Buscar curso por código
    public Curso buscar(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigo)) {
                return curso;
            }
        }
        return null;
    }
    
    //Buscar curso por nombre
    public List<Curso> buscarPorNombre(String nombre) {
    List<Curso> resultados = new ArrayList<>();
        for (Curso curso : cursos) {
            if (curso.getNombre()
                    .toLowerCase()
                    .contains(nombre.toLowerCase())) {
                resultados.add(curso);
            }
        }
        return resultados;
    }

    //Listar todos los cursos
    public List<Curso> listar() {
        return cursos;
    }

    //Verificar si existe un codigo
    public boolean existeCodigo(String codigo) {
        return codigos.contains(codigo);
    }
    
    //Ordenar cursos por código
    public List<Curso> ordenarPorCodigo() {
        List<Curso> copia = new ArrayList<>(cursos);
        copia.sort(Comparator.comparing(Curso::getCodigo));
        return copia;
    }

    //Ordenar cursos por nombre
    public List<Curso> ordenarPorNombre() {
        List<Curso> copia = new ArrayList<>(cursos);
        copia.sort(Comparator.comparing(Curso::getNombre));
        return copia;
    }
}