/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Matricula {

    private int id;
    private Estudiante estudiante;
    private Curso curso;
    private String fecha;
    private String estado;

    public Matricula() {}

    public Matricula(int id, Estudiante estudiante, Curso curso, String fecha, String estado) {
        this.id = id;
        this.estudiante = estudiante;
        this.curso = curso;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getId() { return id; }

    public Estudiante getEstudiante() { return estudiante; }

    public Curso getCurso() { return curso; }

    public String getFecha() { return fecha; }

    public String getEstado() { return estado; }

    public void setId(int id) { this.id = id; }

    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }

    public void setCurso(Curso curso) { this.curso = curso; }

    public void setFecha(String fecha) { this.fecha = fecha; }

    public void setEstado(String estado) { this.estado = estado; }
}