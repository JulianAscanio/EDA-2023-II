/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola;

/**
 *
 * @author estudiante
 */
public class Test {
    public static void main(String[] args) {
        Cola<Integer> c = new Cola();
        c.encolar(10);
        c.encolar(8);
        c.encolar(5);
        c.encolar(2);
        System.out.println("Dato: "+c.desencolar());
        System.out.println("Dato: "+c.desencolar());
        System.out.println("Dato: "+c.desencolar());
        System.out.println("Dato: "+c.desencolar());
    }
}
