/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

/**
 *
 * @author fiore
 */
import java.util.Stack;
        
public class HistorialRepositorio {
    private Stack<String> historial = new Stack<>();
    
    public void agregar(String accion ){
        historial.push(accion);
    }
    public Stack<String> obtenerHistorial(){
        return historial;
    }
}
