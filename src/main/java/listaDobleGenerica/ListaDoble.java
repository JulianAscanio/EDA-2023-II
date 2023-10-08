/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaDobleGenerica;

/**
 *
 * @author Estudiante
 * @param <A>
 */
public class ListaDoble<A> {

    private Nodo<A> inicio;
    private Nodo<A> ultimo;

    public ListaDoble() {
    }

    public ListaDoble(Nodo<A> inicio, Nodo<A> ultimo) {
        this.inicio = inicio;
        this.ultimo = ultimo;
    }

    /**
     * @return the inicio
     */
    public Nodo<A> getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Nodo<A> inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the ultimo
     */
    public Nodo<A> getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(Nodo<A> ultimo) {
        this.ultimo = ultimo;
    }

    public void addInicio(A dato) {
        Nodo<A> nuevo = new Nodo<>();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            inicio.setAnterior(nuevo);
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void addFinal(A dato) {
        Nodo<A> nuevo = new Nodo<>();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
    }

    public boolean buscar(A dato) {
        Nodo<A> aux = inicio;
        while (aux != null) {
            if (aux.getDato() == dato) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    public void eliminar(A dato) {
    }

    public void mostrar() {
        Nodo<A> aux = inicio;
        System.out.print("->");
        while (aux != null) {
            System.out.print("[" + aux.getDato() + "]");
            aux = aux.getSiguiente();
        }
        System.out.println("");
        System.out.print("<-");
        aux = ultimo;
        while (aux != null) {
            System.out.print("[" + aux.getDato() + "]");
            aux = aux.getAnterior();
        }
    }
}
