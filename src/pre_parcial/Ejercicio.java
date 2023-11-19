package pre_parcial;

import listaDobleGenerica.ListaDoble;
import listaDobleGenerica.Nodo;

public class Ejercicio<A> {

    public ListaDoble invertir(ListaDoble l) {
        Nodo<A> aux = l.getUltimo();
        ListaDoble l2 = new ListaDoble();
        while (aux != null) {
            l2.addFinal(aux.getDato());
            aux = aux.getAnterior();
        }
        return l2;
    }

    public ListaDoble dividirLista(ListaDoble l, A x) {
        ListaDoble listaMenor = new ListaDoble<>();
        ListaDoble listaMayor = new ListaDoble<>();
        Nodo<A> aux = l.getInicio();

        /*while (aux != null) {
            Nodo<A> siguiente = aux.getSiguiente();
            aux.setSiguiente(null);

            if (aux.getDato() < x) {
                listaMenor.addFinal(aux.getDato());
            } else {
                listaMayor.addFinal(aux.getDato());
            }
            aux = siguiente;
        }*/
        listaMenor.unirListas(listaMayor);
        return listaMenor;
    }
}
