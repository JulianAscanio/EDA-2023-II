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
public class Pila <A>{
    private Nodo<A> cima;

    /**
     * @return the cima
     */
    public Nodo<A> getCima() {
        return cima;
    }

    /**
     * @param cima the cima to set
     */
    public void setCima(Nodo<A> cima) {
        this.cima = cima;
    }
    
    public void apilar(A dato){
        Nodo <A> nuevo = new Nodo<>(dato, cima);
        cima = nuevo;
    }
    
    public A desapilar(){
        if(cima == null){
            return null;
        }
        A dato = cima.getDato();
        cima = cima.getSiguiente();
        
        return dato;        
    }    
}
