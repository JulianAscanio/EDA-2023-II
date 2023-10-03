/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.ejercicio03;

/**
 *
 * @author ASUS
 */
public class Estudiante {

    String nombre;
    Nota nota;

    public Estudiante() {
    }

    public Estudiante(String nombre, int calificacion) {
        this.nombre = nombre;
        this.nota = new Nota(calificacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nota getCalificacion() {
        return nota;
    }

    public void setCalificacion(Nota calificacion) {
        this.nota = calificacion;
    }
}
