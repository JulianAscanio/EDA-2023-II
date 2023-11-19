
package arreglos.taller02.ejercicio3;

public class Main {
    public static void main(String[] args) {
         int[] matriz = {1,2,4,7,12,25,50,100};

         MayorMenor buscar = new MayorMenor(matriz);
         buscar.encontrarMayorMenor();
    }
}
