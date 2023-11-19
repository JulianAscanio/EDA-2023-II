package primerParcial_1151865_1152096;

import listaDobleGenerica.ListaDoble;
import listaDobleGenerica.Nodo;

public class CerosInterseccionLista<A> {

    public ListaDoble<Integer> interseccionCero(ListaDoble<Integer> l1, ListaDoble<Integer> l2) {
    Nodo<Integer> auxL1 = l1.getInicio();

    while (auxL1 != null) {
        Nodo<Integer> auxL2 = l2.getInicio();
        boolean encontrado = false;

        while (auxL2 != null) {
            if (auxL1.getDato().equals(auxL2.getDato())) {
                auxL1.setDato(0); // Poner en cero el elemento en l1
                encontrado = true;
                break;
            }
            auxL2 = auxL2.getSiguiente();
        }

        auxL1 = auxL1.getSiguiente();
    }

    return l1;
}


    public boolean verificacion(ListaDoble<Integer> Lgrande, ListaDoble<Integer> Lpequeña) {
    Nodo<Integer> auxlp = Lpequeña.getInicio();
    Nodo<Integer> auxLg = Lgrande.getInicio();

    while (auxlp != null) {
        boolean encontrado = false;
        auxLg = Lgrande.getInicio();

        while (auxLg != null) {
            if (auxlp.getDato().equals(auxLg.getDato())) {
                encontrado = true;
                break;
            }
            auxLg = auxLg.getSiguiente();
        }

        if (!encontrado) {
            return false; 
        }

        auxlp = auxlp.getSiguiente();
    }

    return true;  
}

    
    public ListaDoble<Integer> reemplazar(ListaDoble<Integer> lista, int viejo, int nuevo) {
        Nodo<Integer> aux = lista.getInicio();
        while (aux != null) {
            if (aux.getDato() == viejo) {
                aux.setDato(nuevo);
            }
            aux = aux.getSiguiente();
        }
        return lista;
    }
}
