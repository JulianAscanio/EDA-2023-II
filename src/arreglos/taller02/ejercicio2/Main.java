
package arreglos.taller02.ejercicio2;

public class Main {
    public static void main(String[] args) {
        int[] matriz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 10};

        Duplicado buscar = new Duplicado(matriz);
        int numeroDuplicado = buscar.encontrarDuplicado();

        if (numeroDuplicado != -1) {
            System.out.println("El número duplicado es: " + numeroDuplicado);
            
        } else {
            System.out.println("No se encontraron números duplicados en la matriz.");
        }
    }
}
