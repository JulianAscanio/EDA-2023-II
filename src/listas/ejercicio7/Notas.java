/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas.ejercicio7;

/**
 *
 * @author Royner Omaña
 * @param <T>
 */
public class Notas<T extends Number & Comparable<T>> {
    private Nodo<T> inicio;

    public Notas() {
        this.inicio = null;
    }

    public void agregarDato(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            Nodo<T> actual = inicio;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public int obtenerCantidadElementos() {
        int contador = 0;
        Nodo<T> actual = inicio;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    public double calcularPromedio() {
        double suma = 0;
        int cantidadElementos = obtenerCantidadElementos();
        Nodo<T> actual = inicio;
        while (actual != null) {
            suma += actual.getDato().doubleValue();
            actual = actual.getSiguiente();
        }
        return cantidadElementos > 0 ? suma / cantidadElementos : 0;
    }

    public T obtenerNotaMasAlta() {
        if (inicio == null) {
            return null;
        }

        Nodo<T> actual = inicio;
        T notaMasAlta = actual.getDato();
        while (actual != null) {
            if (actual.getDato().compareTo(notaMasAlta) > 0) {
                notaMasAlta = actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return notaMasAlta;
    }

    public T obtenerNotaMasBaja() {
        if (inicio == null) {
            return null;
        }

        Nodo<T> actual = inicio;
        T notaMasBaja = actual.getDato();
        while (actual != null) {
            if (actual.getDato().compareTo(notaMasBaja) < 0) {
                notaMasBaja = actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return notaMasBaja;
    }

    public int obtenerCantidadNotasAltas() {
        int cantidad = 0;
        Nodo<T> actual = inicio;
        while (actual != null) {
            int nota = actual.getDato().intValue();
            if (nota >= 18 && nota <= 20) {
                cantidad++;
            }
            actual = actual.getSiguiente();
        }
        return cantidad;
    }

    public Notas<T> obtenerNotasMayoresAlPromedio() {
        Notas<T> notasMayoresAlPromedio = new Notas<>();
        double promedio = calcularPromedio();

        Nodo<T> actual = inicio;
        while (actual != null) {
            if (actual.getDato().doubleValue() > promedio) {
                notasMayoresAlPromedio.agregarDato(actual.getDato());
            }
            actual = actual.getSiguiente();
        }
        return notasMayoresAlPromedio;
    }

    public double obtenerPorcentajeAprobados() {
        int cantidadAprobados = 0;
        int cantidadEstudiantes = obtenerCantidadElementos();

        Nodo<T> actual = inicio;
        while (actual != null) {
            if (actual.getDato().doubleValue() >= 10) {
                cantidadAprobados++;
            }
            actual = actual.getSiguiente();
        }

        return cantidadEstudiantes > 0 ? (double) cantidadAprobados / cantidadEstudiantes * 100 : 0;
    }

    public double obtenerPorcentajeReprobados() {
        return 100 - obtenerPorcentajeAprobados();
    }
}

