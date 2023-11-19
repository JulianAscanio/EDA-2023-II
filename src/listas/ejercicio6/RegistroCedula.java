/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas.ejercicio6;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import listaDobleGenerica.ListaDoble;

/**
 *
 * @author ASUS
 */
public class RegistroCedula {

    private ListaDoble<Cedula> cedulas;

    public RegistroCedula() {
        cedulas = new ListaDoble<>();
    }

    /**
     * @return the cedula
     */
    public ListaDoble<Cedula> getCedula() {
        return cedulas;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(ListaDoble<Cedula> cedula) {
        this.cedulas = cedula;
    }

    public boolean add(Cedula cedula) {
        if (cedulas.addFinal(cedula)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean buscar(Cedula cedula) {
        return cedulas.buscar(cedula);
    }

    public void ordenarMayorMenor() {
        cedulas.ordenar();
    }

    public int encontrarCedulaMayor(Cedula cedula) {
        int numeroCedula = cedula.getNumero();
        List<Cedula> listaCedulas = cedulas.obtenerElementos();
        int contador = 0;
        for (Cedula c : listaCedulas) {
            if (c.getNumero() > numeroCedula) {
                contador++;
            }
        }
        return contador;
    }

    public void mostrar() {
        cedulas.mostrar();
    }

}
