
package arreglos.taller02.ejercicio1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int tamanoMatriz = 99;
        int numeroFaltante = 87;
        
        Matriz matriz = new Matriz(tamanoMatriz, numeroFaltante);
        
        System.out.println("Matriz generada: ");
        System.out.println(Arrays.toString(matriz.getMatriz()));
        
        int numeroEncontrado = matriz.encontrarNumero(matriz.getMatriz());
        System.out.println("El numero es: "+ numeroEncontrado);
    }
}
