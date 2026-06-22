/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author fiore
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoUtil {
    
    public static void guardarTexto(
            
            String ruta,
            String contenido)
            throws IOException {
        BufferedWriter bw = new BufferedWriter(
        new FileWriter(ruta));
        bw.write(contenido);
        bw.close();
    }
        
    
}
