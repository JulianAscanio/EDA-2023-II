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
public class Repetido {

    public void eliminarValor(Cola cola, int valor) {
        Cola<Integer> temp = new Cola<>();
        while (cola.getInicio() != null) {
            int dato = (int) cola.desencolar();
            if (dato != valor) {
                temp.encolar(dato);
            }
        }
        temp.mostrar();
    }
}
