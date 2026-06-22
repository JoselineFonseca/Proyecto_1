/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

/**
 *
 * @author fiore
 */

import Modelo.Calificacion;
import java.util.ArrayList;
import java.util.List;

public class CalificacionRepo {
    private List<Calificacion> listar = new ArrayList<>();
    
    public void agregar(Calificacion c){
        listar.add(c);
    }
    public void eliminar(Calificacion c){
        listar.remove(c);
    }
    public List<Calificacion> listas(){
        return listar;
    }
}
