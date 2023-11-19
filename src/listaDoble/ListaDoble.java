package listaDoble;

public class ListaDoble {

    private Nodo inicio;
    private Nodo ultimo;

    public ListaDoble() {
    }

    public ListaDoble(Nodo inicio, Nodo ultimo) {
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

    public void addInicio(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            inicio.setAnterior(nuevo);
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void addFinal(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
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
    }

    public void mostrar() {
        Nodo aux = inicio;
        System.out.print("->");
        while (aux != null) {
            System.out.print("[" + aux.getDato() + "]<=>");
            aux = aux.getSiguiente();
        }
        System.out.println("");
        System.out.print("<-");
        aux = ultimo;
        while (aux != null) {
            System.out.print("[" + aux.getDato() + "]<=>");
            aux = aux.getAnterior();
        }
    }
}
