/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/*
 Excepción personalizada para errores de matrícula
*/
public class MatriculaInvalidaException extends Exception {

    public MatriculaInvalidaException(String mensaje) {
        super(mensaje);
    }
}
