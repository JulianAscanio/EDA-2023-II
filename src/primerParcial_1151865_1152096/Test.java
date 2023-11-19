/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerParcial_1151865_1152096;

import listaDobleGenerica.ListaDoble;

/**
 *
 * @author ASUS
 */
public class Test {

    public static void main(String[] args) {
        CerosInterseccionLista inter = new CerosInterseccionLista();
        ListaDoble ls1 = new ListaDoble();
        ls1.addInicio(5);
        ls1.addInicio(4);
        ls1.addInicio(3);
        ls1.addInicio(2);
        ls1.addInicio(1);

        ls1.addInicio(6);
        ls1.addInicio(4);
        ls1.addInicio(2);

        ListaDoble ls2 = new ListaDoble();
        ls2.addInicio(4);
        ls2.addInicio(2);
        
        
        inter.interseccionCero(ls1, ls2).mostrar();
        ls2.addInicio(9);
        ls2.addInicio(3);
        ls2.addInicio(7);
        ls2.addInicio(3);
        ls2.addInicio(5);
        ls2.addInicio(3);
        ls2.addInicio(1);
        
        if (inter.verificacion(ls2, ls1)) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        inter.reemplazar(ls2, 3, 8).mostrar();
    }
}
