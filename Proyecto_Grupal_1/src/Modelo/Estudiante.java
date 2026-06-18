
package Modelo;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Estudiante {
    private int id;
    private int edad;
    private boolean activo;
    private String genero;
    private String correo;
    private String nombre;
    private String carrera;
    private String telefono;
    private String observaciones;
    
    public Estudiante (int id, int edad,boolean activo, String genero, String correo, String nombre , String carrera, String telefono,  String observaciones ){
            this.id = id;
            this.edad = edad;
            this.activo = activo;
            this.genero = genero;
            this.correo= correo;
            this.nombre = nombre;
            this.carrera = carrera;
            this.telefono = telefono;
            this.observaciones= observaciones;
            
            
    }
    
   //getter y setter
    public int getId(){return id;}
    public int getEdad (){return edad;}
    public boolean getActivo(){return activo;}
    public String getGenero (){return genero;}
    public String getCorreo (){return correo;}
    public String getnombre (){return nombre;}
    public String getCarrera (){return carrera;}
    public String getTelefono (){return telefono;}
    public String getObservaciones (){return observaciones;}
    
    public void setNombre(String nombre){this.nombre =nombre;}
    public void setEdad(int edad){this.edad =edad;}
    public void setCarrera(String carrera){this.carrera =carrera;}
    public void setGenero(String genero){this.genero =genero;}
    public void setActivo(boolean activo){this.activo =activo;}
    public void setCorreo(String correo){this.correo =correo;}
    public void setTelefono(String telefono){this.telefono =telefono;}
    public void setObservaciones(String nombre){this.observaciones =observaciones;}

}
