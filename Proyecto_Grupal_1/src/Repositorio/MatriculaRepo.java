/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import Modelo.Matricula;
import java.util.*;

public class MatriculaRepo {

    private List<Matricula> matriculas = new ArrayList<>();

    private Set<String> duplicados = new HashSet<>();

    //historial requerido por el proyecto
    private Stack<String> historial = new Stack<>();

    public void agregar(Matricula m) throws Exception {

        String clave =
                m.getEstudiante().getCorreo()
                + "-"
                + m.getCurso().getCodigo();

        if (duplicados.contains(clave)) {
            throw new Exception("Duplicado");
        }

        matriculas.add(m);

        duplicados.add(clave);

        historial.push(
                "Matrícula registrada: "
                + m.getEstudiante().getnombre()
                + " -> "
                + m.getCurso().getNombre()
        );
    }

    public List<Matricula> listar() {
        return matriculas;
    }

    public void eliminar(Matricula m) {

        String clave =
                m.getEstudiante().getCorreo()
                + "-"
                + m.getCurso().getCodigo();

        duplicados.remove(clave);

        matriculas.remove(m);

        historial.push(
                "Matrícula eliminada: "
                + m.getEstudiante().getnombre()
                + " -> "
                + m.getCurso().getNombre()
        );
    }

    public Stack<String> obtenerHistorial() {
        return historial;
    }
}