package arreglos.taller02.ejercicio2;

import java.util.HashSet;

public class Duplicado {

    int[] matriz;

    public Duplicado() {
    }

    public Duplicado(int[] matriz) {
        this.matriz = matriz;
    }

    public int[] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[] matriz) {
        this.matriz = matriz;
    }

    public int encontrarDuplicado() {
        int n = matriz.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matriz[i] == matriz[j]) {
                    return matriz[i]; // Hemos encontrado un duplicado
                }
            }
        }

        return -1; // Si no se encuentra ningún duplicado
    }
}
