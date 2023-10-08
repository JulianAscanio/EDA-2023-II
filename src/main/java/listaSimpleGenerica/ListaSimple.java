package listaSimpleGenerica;

public class ListaSimple<A> {

    private Nodo<A> inicio;
    private Nodo<A> ultimo;

    /**
     * @return the incio
     */
    public Nodo<A> getInicio() {
        return inicio;
    }

    /**
     * @param inicio
     */
    public void setInicio(Nodo<A> inicio) {
        this.inicio = inicio;
    }

    public void addInicio(A dato) {
        Nodo<A> nuevo = new Nodo<>();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void addFinal(A dato) {
        Nodo<A> nuevo = new Nodo<>();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            /*Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);*/

            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }

    public boolean buscar(A dato) {
        Nodo<A> aux = inicio;
        while (aux != null) {
            if (aux.getDato() == dato) {
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
        if (inicio.getDato() == dato) {
            inicio = inicio.getSiguiente();
            return;
        }

        Nodo<A> anterior = null;
        Nodo<A> aux = inicio;

        while (aux != null && aux.getDato() != dato) {
            anterior = aux;
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            anterior.setSiguiente(aux.getSiguiente());
        } else {
            System.out.println("El elemento " + dato + " no se encontró en la lista.");
        }
    }

    public void mostrar() {
        Nodo<A> aux = inicio;
        while (aux != null) {
            System.out.println("[" + aux.getDato() + "]");
            aux = aux.getSiguiente();
        }
    }
}
