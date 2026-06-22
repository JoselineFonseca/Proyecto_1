/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import Modelo.Matricula;
import java.util.ArrayList;
import java.util.List;

public class MatriculaRepo {

    private List<Matricula> matriculas = new ArrayList<>();

    public void agregar(Matricula m) {
        matriculas.add(m);
    }

    public List<Matricula> listar() {
        return matriculas;
    }

    public boolean eliminar(int id) {
        return matriculas.removeIf(m -> m.getId() == id);
    }

    public Matricula buscar(int id) {
        for (Matricula m : matriculas) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    public boolean existeDuplicado(int estudianteId, int cursoId) {
        for (Matricula m : matriculas) {
            if (m.getEstudiante().getId() == estudianteId &&
                m.getCurso().getId() == cursoId) {
                return true;
            }
        }
        return false;
    }
}