/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola;

/**
 *
 * @author estudiante
 * @param <E>
 */
public class Cola<E> {

    private Nodo<E> inicio;
    private Nodo<E> ultimo;

    /**
     * @return the inicio
     */
    public Nodo<E> getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Nodo<E> inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the ultimo
     */
    public Nodo<E> getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(Nodo<E> ultimo) {
        this.ultimo = ultimo;
    }

    public void encolar(E dato) {
        Nodo<E> aux = new Nodo(dato, null);

        if (inicio == null) {
            inicio = aux;
            ultimo = aux;
        } else {
            ultimo.setSiguiente(aux);
            ultimo = aux;
        }
    }

    public E desencolar() {
        E resultado = inicio.getDato();
        inicio = inicio.getSiguiente();
        return resultado;
    }

    public void mostrar() {
        Nodo<E> aux = inicio;
        while (aux != null) {
            System.out.println("[" + aux.getDato() + "]");
            aux = aux.getSiguiente();
        }
    }
}
