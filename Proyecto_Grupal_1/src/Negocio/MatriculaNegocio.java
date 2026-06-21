/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Modelo.Matricula;
import Repositorio.MatriculaRepo;
import Excepciones.MatriculaInvalidaException;

/*
 Reglas de negocio de matrícula
*/
public class MatriculaNegocio {

    private MatriculaRepo repo = new MatriculaRepo();

    public void registrar(Matricula m)
            throws MatriculaInvalidaException {

        //verificar estudiante activo
        if (!m.getEstudiante().getActivo()) {

            throw new MatriculaInvalidaException(
                    "El estudiante está inactivo");
        }

        //verificar curso activo
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
}