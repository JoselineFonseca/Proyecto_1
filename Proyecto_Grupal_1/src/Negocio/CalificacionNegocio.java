/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

        
/**
 *
 * @author fiore
 */

import Excepciones.NotaInvalidaException;
import Modelo.Calificacion;
import Repositorio.CalificacionRepo;
import java.util.List;

public class CalificacionNegocio {
    private CalificacionRepo repo = new CalificacionRepo();
    
    public void agregar(Calificacion c) throws NotaInvalidaException {
        
        if(c.getNota()< 0 || c.getNota()> 100 ){
        throw new NotaInvalidaException("La nota debe estar entre 0 y 100");
    }
        repo.agregar(c);
    }
    public void eliminar(Calificacion c){
        repo.eliminar(c);
    }
    public List<Calificacion>listar(){
        return repo.listas();
    }
    public String obtenerEstado(double nota){
        if(nota >= 70){
            return "Aprobado";
        }
        return "Reprobado";
    }
}
