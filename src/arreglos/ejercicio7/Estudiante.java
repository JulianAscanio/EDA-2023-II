/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.ejercicio7;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Estudiante {

    String nombre;
    ArrayList<Nota> nota;

    public Estudiante() {
    }

    public Estudiante(String nombre, ArrayList<Nota> nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Nota> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Nota> nota) {
        this.nota = nota;
    }

    public double calcularPremedio(Nota[] notas) {
        int suma = 0;
        for (Nota nota : notas) {
            suma += nota.getValor();
        }
        return suma / notas.length;
    }

    public void ordenarNotas(Nota[] notas) {
        int n = nota.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (nota.get(i).getValor() < nota.get(i+1).getValor()) {
                    Nota temp = nota.get(j);
                    nota.set(j, nota.get(j+1));
                    nota.set(j + 1, temp);
                }
            }
        }
    }

    public Nota encontrarNotaMasAlta(Nota[] notas) {
        Nota alta = notas[0];
        for (Nota nota : notas) {
            if (nota.getValor() > alta.getValor()) {
                alta = nota;
            }
        }
        return alta;
    }

    public Nota encontrarNotaMasBaja(Nota[] notas) {
        Nota baja = notas[0];
        for (Nota nota : notas) {
            if (nota.getValor() < baja.getValor()) {
                baja = nota;
            }
        }
        return baja;
    }

    public int contarNotasAltas(Nota[] notas, int valorMinimo) {
        int contador = 0;
        for (Nota nota : notas) {
            if (nota.getValor() >= valorMinimo) {
                contador++;
            }
        }
        return contador;
    }

    public void notaMayorPromedio(Nota[] notas) {
        double promedio = calcularPremedio(notas);
        System.out.println("Notas Mayores al prmedio: ");
        for (Nota nota : notas) {
            if (nota.getValor() > promedio) {
                nota.toString();
            }
        }
    }
}
