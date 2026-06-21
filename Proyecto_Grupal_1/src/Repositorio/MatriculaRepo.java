/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import Modelo.Matricula;
import java.util.*;

public class MatriculaRepo {

    private List<Matricula> matriculas = new ArrayList<>();

    //control de matrículas repetidas
    private Set<String> duplicados = new HashSet<>();

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
    }
}