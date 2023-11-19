/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TablaHash.ejercicio2;

/**
 *
 * @author estudiante
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo equipo = new Equipo();
        equipo.add(new Jugadores("James", "121433", "Calle 2", "3124356343"));
        equipo.add(new Jugadores("Luis", "123433", "Calle 3", "3224356343"));
        equipo.add(new Jugadores("Falcao", "128433", "Calle 1", "3104356343"));
        System.out.println("Jugador: " + equipo.obtener("123433"));
    }
    
}
