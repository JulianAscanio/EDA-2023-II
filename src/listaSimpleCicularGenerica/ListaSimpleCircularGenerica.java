package listaSimpleCicularGenerica;

public class ListaSimpleCircularGenerica<A> {

    private Nodo<A> inicio;
    private Nodo<A> ultimo;

    public ListaSimpleCircularGenerica() {
    }

    public ListaSimpleCircularGenerica(Nodo<A> inicio, Nodo<A> ultimo) {
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

    void addInicio(A dato) {
        Nodo<A> nuevo = new Nodo<>();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            ultimo.setSiguiente(inicio);
        }
    }

    void addFinal(A dato) {
        Nodo<A> nuevo = new Nodo<>();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
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
        Nodo<A> aux = inicio;
        Nodo<A> anterior = null;
        do {
            if (aux.getDato() == dato) {
                if (anterior != null) {
                    anterior.setSiguiente(aux.getSiguiente());
                }
                if (aux == inicio) {
                    inicio = inicio.getSiguiente();
                    ultimo.setSiguiente(inicio);
                }
                if (aux == ultimo) {
                    ultimo = anterior;
                    ultimo.setSiguiente(inicio);
                }
            }
            anterior = aux;
            aux = aux.getSiguiente();
        } while (aux != null);
    }

    public void mostrar() {
        Nodo<A> aux = inicio;
        while (aux != null) {
            System.out.print("-->[" + aux.getDato() + "]-->");
            aux = aux.getSiguiente();
            if (aux == inicio) {
                break;
            }
        }
    }
}
