/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Modelo.Matricula;
import Repositorio.MatriculaRepo;
import Excepciones.MatriculaInvalidaException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MatriculaNegocio {

    private MatriculaRepo repo = new MatriculaRepo();

    public void registrar(Matricula m)
            throws MatriculaInvalidaException {

        if (!m.getEstudiante().getActivo()) {

            throw new MatriculaInvalidaException(
                    "El estudiante está inactivo");
        }

        if (!m.getCurso().isActivo()) {

            throw new MatriculaInvalidaException(
                    "El curso está inactivo");
        }

        try {

            repo.agregar(m);

        } catch (Exception e) {

            throw new MatriculaInvalidaException(
                    "El estudiante ya está matriculado en este curso");
        }
    }

    public List<Matricula> listar() {
        return repo.listar();
    }

    public void eliminar(Matricula m) {
        repo.eliminar(m);
    }

    public Stack<String> historial() {
        return repo.obtenerHistorial();
    }

    //buscar por estudiante
    public List<Matricula> buscarPorEstudiante(String nombre) {

        List<Matricula> resultado = new ArrayList<>();

        for (Matricula m : repo.listar()) {

            if (m.getEstudiante()
                    .getnombre()
                    .toLowerCase()
                    .contains(nombre.toLowerCase())) {

                resultado.add(m);
            }
        }

        return resultado;
    }

    //buscar por curso
    public List<Matricula> buscarPorCurso(String curso) {

        List<Matricula> resultado = new ArrayList<>();

        for (Matricula m : repo.listar()) {

            if (m.getCurso()
                    .getNombre()
                    .toLowerCase()
                    .contains(curso.toLowerCase())) {

                resultado.add(m);
            }
        }

        return resultado;
    }
}