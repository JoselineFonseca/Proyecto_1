/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Modelo.Matricula;
import Repositorio.MatriculaRepo;
import Excepciones.DatoInvalidoException;

import java.util.List;

public class MatriculaNegocio {

    private MatriculaRepo repo = new MatriculaRepo();

    public void registrar(Matricula m) throws DatoInvalidoException {

        if (m.getEstudiante() == null || !m.getEstudiante().getActivo()) {
            throw new DatoInvalidoException("El estudiante no está activo");
        }

        if (m.getCurso() == null || !m.getCurso().isActivo()) {
            throw new DatoInvalidoException("El curso no está activo");
        }

        if (repo.existeDuplicado(
                m.getEstudiante().getId(),
                m.getCurso().getId())) {
            throw new DatoInvalidoException("El estudiante ya está matriculado en este curso");
        }

        repo.agregar(m);
    }

    public List<Matricula> listar() {
        return repo.listar();
    }

    public boolean eliminar(int id) {
        return repo.eliminar(id);
    }

    public Matricula buscar(int id) {
        return repo.buscar(id);
    }
}