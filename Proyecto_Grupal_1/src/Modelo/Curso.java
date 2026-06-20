/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Geirel
 */
public class Curso {
    
    //Variables privadas
    private int id;
    private String codigo;
    private String nombre;
    private int creditos;
    private String profesor;
    private boolean activo;
    
    //Constructor
    public Curso(){
        
    }
    public Curso(int id, String codigo, String nombre, int creditos, String profesor, boolean activo) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
        this.activo = activo;
    }

    //Getter
    public int getId() {
        return id;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCreditos() {
        return creditos;
    }
    public String getProfesor() {
        return profesor;
    }
    public boolean isActivo() {
        return activo;
    }
    
    //Setter
    public void setId(int id) {
        this.id = id;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }    
}
