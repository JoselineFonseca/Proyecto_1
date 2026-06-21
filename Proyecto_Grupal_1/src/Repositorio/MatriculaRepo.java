/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import Modelo.Matricula;
import java.util.ArrayList;
import java.util.List;

/*
 Repositorio encargado de guardar las matrículas
*/
public class MatriculaRepo {

    private List<Matricula> matriculas = new ArrayList<>();

    //guardar matrícula
    public void agregar(Matricula m) {
        matriculas.add(m);
    }

    //listar matrículas
    public List<Matricula> listar() {
        return matriculas;
    }

    //eliminar matrícula
    public void eliminar(Matricula m) {
        matriculas.remove(m);
    }
}