/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosPilasColas.EliminarRepetido;

import cola.Cola;

/**
 *
 * @author estudiante
 */
public class Test {

    public static void main(String[] args) {
        Cola<Integer> c = new Cola();
        Repetido r = new Repetido();
        c.encolar(1);
        c.encolar(3);
        c.encolar(5);
        c.encolar(4);
        c.encolar(2);
        c.encolar(3);
        c.encolar(7);
        c.encolar(3);
        c.encolar(5);

        r.eliminarValor(c, 3);
    }
}
