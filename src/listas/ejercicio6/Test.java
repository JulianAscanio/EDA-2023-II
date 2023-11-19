/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas.ejercicio6;

/**
 *
 * @author ASUS
 */
public class Test {

    public static void main(String[] args) {
        RegistroCedula rc = new RegistroCedula();
        rc.add(new Cedula(19145954));
        rc.add(new Cedula(12345678));
        rc.add(new Cedula(31518656));
        rc.add(new Cedula(19144473));
        rc.add(new Cedula(23451819));
        rc.add(new Cedula(13451800));
        rc.add(new Cedula(45451811));
        rc.add(new Cedula(28451818));
        rc.add(new Cedula(40451815));
        rc.add(new Cedula(31451614));

        rc.mostrar();
        System.out.println("");
        Cedula cedulaBuscar = new Cedula(19144473);
        if (rc.buscar(cedulaBuscar)) {
            System.out.println("El numero de "+cedulaBuscar+" se encuentra en la lista.");
        } else {
            System.out.println("El numero de "+cedulaBuscar+" no se encuentra en la lista.");
        }
        
        System.out.println("");
        Cedula cedulaMenor = new Cedula(19145954);
        int mayores = rc.encontrarCedulaMayor(cedulaMenor);
        System.out.println("Hay " + mayores + " números mayores a la " + cedulaMenor);
        
        System.out.println("");
        System.out.println("Lista Ordenada:");
        rc.ordenarMayorMenor();
        rc.mostrar();
    }
}
