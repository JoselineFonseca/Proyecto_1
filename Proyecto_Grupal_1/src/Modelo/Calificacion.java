/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author fiore
 */
public class Calificacion {
    
    private int id;
    private Estudiante estudiante;
    private Curso curso;
    private double nota;
    private String observacion;
    
    public Calificacion(int id, Estudiante estudiante, Curso curso, double nota, String observacion){
        
        this.id = id;
        this.estudiante = estudiante;
        this.curso = curso;
        this.nota = nota;
        this.observacion = observacion;
       
    }
    public int getId(){
        return id;
    }
    public Estudiante getEstudiante(){
         return estudiante;
    }
    public Curso getCurso(){
        return curso;
    }
    public double getNota(){
        return nota;
    }
    public String getObservacion(){
        return observacion;
    }  
    public void setId(int id){
        this.id = id;
    }
    public void setEstudiante(Estudiante estudiante){
        this.estudiante = estudiante;
    }
    public void setCurso(Curso curso)  {
        this.curso = curso;
    }         
                
    public void setNota(double nota){
        this.nota = nota;
    }
    public void setObservacion(String observacion){
        this.observacion = observacion;
    }
}

    

    