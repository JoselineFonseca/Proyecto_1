/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Geirel
 */
public class Direccion {
    
    //Variables privadas
    private String provincia;
    private String cuidad;

    //Constructor
    public Direccion(String provincia, String cuidad) {
        this.provincia = provincia;
        this.cuidad = cuidad;
    }
    
    //Getter y Setter
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getCuidad() {
        return cuidad;
    }
    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }
    
    
    
    
    
}
