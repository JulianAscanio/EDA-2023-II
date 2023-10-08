/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaDobleGenerica;

/**
 *
 * @author Estudiante
 */
public class Test {
    public static void main(String[] args) {
        ListaDoble <Integer> ls = new ListaDoble<>();
        ls.addInicio(2);
        ls.addInicio(45);
        ls.addInicio(23);
        ls.addFinal(10);
        ls.addFinal(15);
        
        int valorBuscar = 45;

        if (ls.buscar(valorBuscar)) {
            System.out.println("El valor " + valorBuscar + " está en la lista.");
        } else {
            System.out.println("El valor " + valorBuscar + " no está en la lista.");
        }
        ls.mostrar();
    }
}
