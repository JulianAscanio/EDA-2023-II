package arreglos.taller02.ejercicio1;

public class Matriz {

    int[] matriz;

    public Matriz(int tamanoMatriz, int numeroFaltante) {
        matriz = generarMatriz(tamanoMatriz, numeroFaltante);
    }

    public int[] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[] matriz) {
        this.matriz = matriz;
    }

    private int[] generarMatriz(int tamano, int numeroFaltante) {
        int[] matriz = new int[tamano];
        int contador = 1;

        for (int i = 0; i < tamano; i++) {
            if (contador == numeroFaltante) {
                contador++;
            }
            matriz[i] = contador;
            contador++;
        }

        return matriz;
    }

    public int encontrarNumero(int[] matriz) {
        int sumaEsperada = 0;
        int sumaReal = 0;

        for (int i = 1; i <= 100; i++) {
            sumaEsperada += i;
        }
        for (int numero : matriz) {
            sumaReal += numero;
        }

        return sumaEsperada - sumaReal;
    }
}
