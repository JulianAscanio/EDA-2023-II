/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas.ejercicio6;

import java.util.Objects;

/**
 *
 * @author ASUS
 */
public class Cedula {
    private int numero;

    public Cedula() {
    }

    public Cedula(int numero) {
        this.numero = numero;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Cedula cedula = (Cedula) obj;
        return this.numero == cedula.numero;
    }
    
    

    @Override
    public String toString() {
        return "Cedula numero: " + numero;
    }

    
}
