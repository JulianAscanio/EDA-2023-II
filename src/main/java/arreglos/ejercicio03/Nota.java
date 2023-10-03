package arreglos.ejercicio03;

import java.util.Arrays;
import java.util.Comparator;

public class Nota {

    int valor;

    public Nota(int valor) {
        if (valor < 1 || valor > 20) {
            System.err.print("La nota debe estar entre 1 y 20. :(");
        }
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public double calcularPremedio(Nota[] notas) {
        int suma = 0;
        for (Nota nota : notas) {
            suma += nota.getValor();
        }
        return suma / notas.length;
    }

    public static int contarNotasMayoresOIguales(Nota[] notas, int valor) {
        int contador = 0;
        for (Nota nota : notas) {
            if (nota.getValor() >= valor) {
                contador++;
            }
        }
        return contador;
    }

    public static void ordenarNotasDeMenorAMayor(Nota[] notas) {
        Arrays.sort(notas, new Comparator<Nota>() {
            @Override
            public int compare(Nota n1, Nota n2) {
                return n1.getValor() - n2.getValor();
            }
        });
    }
}
