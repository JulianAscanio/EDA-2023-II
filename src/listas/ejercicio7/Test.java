/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas.ejercicio7;

/**
 *
 * @author Royner Omaña
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notas<Integer> notas = new Notas<>();

        for (int i = 0; i < 58; i++) {
            int nota = (int) (Math.random() * 20) + 1;
            notas.agregarDato(nota);
        }

        System.out.println("Promedio de la clase: " + notas.calcularPromedio());
        System.out.println("Nota mas alta: " + notas.obtenerNotaMasAlta());
        System.out.println("Nota mas baja: " + notas.obtenerNotaMasBaja());
        System.out.println("Cantidad de estudiantes con notas de 18, 19 u 20: " + notas.obtenerCantidadNotasAltas());
        System.out.println("Notas mayores al promedio: " + notas.obtenerNotasMayoresAlPromedio().toString());
        System.out.println("Porcentaje de estudiantes aprobados: " + notas.obtenerPorcentajeAprobados() + "%");
        System.out.println("Porcentaje de estudiantes reprobados: " + notas.obtenerPorcentajeReprobados() + "%");
    
    }
    
}
