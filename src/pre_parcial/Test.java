package pre_parcial;

import listaDobleGenerica.ListaDoble;

public class Test {

    public static void main(String[] args) {
        Ejercicio ej = new Ejercicio();
        ListaDoble ls = new ListaDoble();
        ls.addInicio(1);
        ls.addInicio(4);
        ls.addInicio(3.2);
        ls.addInicio(5);
        ls.addInicio(2);
        ls.addInicio(3.5);

        //ls.mostrar();
        System.out.println("");
        
        //System.out.println("Lista Invertida");
        //ej.invertir(ls).mostrar();
        ej.dividirLista(ls, 3.5).mostrar();
    }
}
