/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

/**
 *
 * @author Julian Ascanio
 * @param <A>
 */
public class Nodo <A>{
    private A dato;
    private Nodo<A> siguiente;

    public Nodo(A dato, Nodo<A> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    /**
     * @return the dato
     */
    public A getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(A dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public Nodo<A> getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo<A> siguiente) {
        this.siguiente = siguiente;
    }
    
}
