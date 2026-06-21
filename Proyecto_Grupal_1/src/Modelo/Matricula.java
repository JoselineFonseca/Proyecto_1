/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/*
 Modelo que representa una matrícula
*/
public class Matricula {

    private int id;
    private Estudiante estudiante;
    private Curso curso;
    private String fechaMatricula;
    private String estado;

    public Matricula(int id,
            Estudiante estudiante,
            Curso curso,
            String fechaMatricula,
            String estado) {

        this.id = id;
        this.estudiante = estudiante;
        this.curso = curso;
        this.fechaMatricula = fechaMatricula;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
