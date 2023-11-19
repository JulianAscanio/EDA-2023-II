package listaCicularDoble;

public class ListaCircularDoble<A> {

    private Nodo<A> inicio;
    private Nodo<A> ultimo;

    public ListaCircularDoble() {
    }

    public ListaCircularDoble(Nodo<A> inicio, Nodo<A> ultumo) {
        this.inicio = inicio;
        this.ultimo = ultumo;
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
     * @return the ultumo
     */
    public Nodo<A> getUltumo() {
        return ultimo;
    }

    /**
     * @param ultumo the ultumo to set
     */
    public void setUltumo(Nodo<A> ultumo) {
        this.ultimo = ultumo;
    }

    public boolean addInicio(A dato) {
        Nodo<A> nuevo = new Nodo<>();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
            inicio.setAnterior(ultimo);
            ultimo.setSiguiente(inicio);
            return true;
        } else {
            inicio.setAnterior(nuevo);
            nuevo.setSiguiente(inicio);
            nuevo.setAnterior(ultimo);
            inicio = nuevo;
            ultimo.setSiguiente(inicio);
            return true;
        }
    }

    public boolean addFinal(A dato) {
        Nodo<A> nuevo = new Nodo<>();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
            inicio.setAnterior(ultimo);
            ultimo.setSiguiente(inicio);
            return true;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
            inicio.setAnterior(ultimo);
            ultimo.setSiguiente(inicio);
            return true;
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
        Nodo<A> anterior = ultimo;
        do {
            if (aux.getDato() == dato) {
                if (anterior != null) {
                    anterior.setSiguiente(aux.getSiguiente());
                    aux.setSiguiente(anterior);
                }
                if (aux == inicio) {
                    inicio = inicio.getSiguiente();
                    ultimo.setSiguiente(inicio);
                    inicio.setAnterior(ultimo);
                }
                if (aux == ultimo) {
                    ultimo = anterior;
                    inicio.setAnterior(ultimo);
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
            System.out.print("<-->[" + aux.getDato() + "]-->");
            aux = aux.getSiguiente();
            if (aux == inicio) {
                break;
            }
        }
    }

}
