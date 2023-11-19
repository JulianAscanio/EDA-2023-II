/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaCicularDoble;

/**
 *
 * @author ASUS
 */
public class Test {

    public static void main(String[] args) {
        ListaCircularDoble<Integer> lista = new ListaCircularDoble<>();

        lista.addFinal(1);
        lista.addFinal(2);
        lista.addFinal(3);
        lista.addFinal(4);

        System.out.println("Lista original:");
        lista.mostrar();

        System.out.println("\nBuscando: " + lista.buscar(3));

        lista.eliminar(2);
        System.out.println("\nLista actualizada:");
        lista.mostrar();
    }
}
