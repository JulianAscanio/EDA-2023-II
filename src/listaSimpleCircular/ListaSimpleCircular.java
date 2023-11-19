package listaSimpleCircular;

public class ListaSimpleCircular {

    private Nodo inicio;
    private Nodo ultimo;

    public ListaSimpleCircular() {
    }

    public ListaSimpleCircular(Nodo inicio, Nodo ultimo) {
        this.inicio = inicio;
        this.ultimo = ultimo;
    }

    /**
     * @return the inicio
     */
    public Nodo getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the ultimo
     */
    public Nodo getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    void addInicio(int dato) {
        Nodo nuevo = new Nodo();
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

    void addFinal(int dato) {
        Nodo nuevo = new Nodo();
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

    public boolean buscar(int dato) {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getDato() == dato) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    public void eliminar(int dato) {
        Nodo aux = inicio;
        Nodo anterior = null;
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
        } while (aux != inicio);
    }

    public void mostrar() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.print("-->[" + aux.getDato() + "]-->");
            aux = aux.getSiguiente();
            if (aux == inicio) {
                break;
            }
        }
    }
}
