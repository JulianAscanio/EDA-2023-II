package listaDobleGenerica;

import java.util.ArrayList;
import java.util.List;

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

    public boolean addInicio(A dato) {
        Nodo<A> nuevo = new Nodo<>();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
            return true;
        } else {
            inicio.setAnterior(nuevo);
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            return true;
        }
    }

    public boolean addFinal(A dato) {
        Nodo<A> nuevo = new Nodo<>();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
            return true;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
            return true;
        }
    }

    public boolean buscar(A dato) {
        Nodo<A> aux = inicio;
        while (aux != null) {
            if (aux.getDato().equals(dato)) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    public void eliminar(A dato) {
        if (inicio == null) {
            System.out.println("Lista vacia.");
        }

        Nodo aux = inicio;

        if (aux.getDato() == dato) {
            inicio = aux.getSiguiente();
            if (inicio != null) {
                inicio.setAnterior(null);
            } else {
                ultimo = null;
            }
            return;
        }

        Nodo anterior = null;

        while (aux != null && aux.getDato() != dato) {
            aux = aux.getSiguiente();
        }
        if (aux == null) {
            System.out.println("El elemento " + dato + " no se encontró en la lista.");
        }
        Nodo<A> ante = aux.getAnterior();
        Nodo<A> sig = aux.getSiguiente();

        if (ante != null) {
            ante.setSiguiente(sig);
        }
        if (sig != null) {
            sig.setAnterior(ante);
        }
    }

    public List<A> obtenerElementos() {
        List<A> elementos = new ArrayList<>();
        Nodo<A> nodoActual = inicio;
        while (nodoActual != null) {
            elementos.add(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }
        return elementos;
    }

    public void ordenar() {
        if (inicio == null || inicio == ultimo) {
            // La lista está vacía o tiene solo un elemento, no es necesario ordenar.
            System.out.println("No es necesario Ordenar");
        }

        Nodo<A> nuevo = inicio;

        while (nuevo != null) {
            Nodo<A> mayor = nuevo;
            Nodo<A> comparador = nuevo.getSiguiente();

            while (comparador != null) {
                if (comparador.getDato().toString().compareTo(mayor.getDato().toString()) > 0) {
                    mayor = comparador;
                }
                comparador = comparador.getSiguiente();
            }

            // Intercambiar los datos entre "nuevo" y "mayor"
            A aux = nuevo.getDato();
            nuevo.setDato(mayor.getDato());
            mayor.setDato(aux);

            nuevo = nuevo.getSiguiente();
        }
    }

    public void mostrar() {
        Nodo<A> aux = inicio;
        while (aux != null) {
            System.out.println("[" + aux.getDato() + "]");
            aux = aux.getSiguiente();
        }
    }

    public void vaciarLista() {
        inicio = null;
        ultimo = null;
    }

    public void unirListas(ListaDoble<A> lista) {

        if (inicio == null) {
            inicio = lista.inicio;
        }
        if (lista.inicio != null) {
            ultimo.setSiguiente(lista.inicio);
            lista.inicio.setAnterior(ultimo);
            ultimo = lista.ultimo;
        }

        lista.inicio = null;
        lista.ultimo = null;
    }
}
