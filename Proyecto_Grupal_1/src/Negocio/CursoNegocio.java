/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author Geirel
 */
import Modelo.Curso;
import Repositorio.CursoRepo;
import Excepciones.DatoInvalidoException;
import Excepciones.RegistrosDuplicadosException;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class CursoNegocio {
    
    private CursoRepo repo;

    public CursoNegocio() {
        repo = new CursoRepo();
    }
    //Listar todos los cursos
    public List<Curso> listar() {
        return repo.listar();
    }
    
    //Registrar un nuevo curso
    public void agregar(Curso curso)
            throws DatoInvalidoException,
                   RegistrosDuplicadosException {
        if (curso.getCodigo() == null ||
            curso.getCodigo().trim().isEmpty()) {
            throw new DatoInvalidoException(
                    "El código es obligatorio");
        }
        if (curso.getNombre() == null ||
            curso.getNombre().trim().isEmpty()) {
            throw new DatoInvalidoException(
                    "El nombre es obligatorio");
        }
        if (curso.getCreditos() <= 0) {
            throw new DatoInvalidoException(
                    "Los créditos deben ser mayores que 0");
        }
        if (curso.getProfesor() == null ||
            curso.getProfesor().trim().isEmpty()) {
            throw new DatoInvalidoException(
                    "El profesor es obligatorio");
        }
        if (repo.existeCodigo(curso.getCodigo())) {
            throw new RegistrosDuplicadosException(
                    "Ya existe un curso con ese código");
        }
        repo.agregar(curso);
    }

    //Buscar curso por codigo
    public Curso buscar(String codigo) {
        return repo.buscar(codigo);
    }
    
    //Eliminar curso por codigo
    public boolean eliminar(String codigo) {
        return repo.eliminar(codigo);
    }
    
    //Buscar curso por nombre
    public List<Curso> buscarPorNombre(String nombre) {
        return repo.buscarPorNombre(nombre);
    }
    
    //Ordenar cursos por nombre
    public List<Curso> ordenarPorCodigo() {
    List<Curso> lista = repo.listar();
        Collections.sort(lista,
                Comparator.comparing(Curso::getCodigo));
        return lista;
    }
    
    //Ordenar curso por nombre
    public List<Curso> ordenarPorNombre() {
    List<Curso> lista = repo.listar();
        Collections.sort(lista,
                Comparator.comparing(Curso::getNombre));
        return lista;
    }
    
    //Editar curso
    public boolean editar(Curso curso)
        throws DatoInvalidoException {
        if (curso.getNombre() == null ||
            curso.getNombre().trim().isEmpty()) {
            throw new DatoInvalidoException(
                    "El nombre es obligatorio");
        }
        return repo.editar(curso);
    }
}