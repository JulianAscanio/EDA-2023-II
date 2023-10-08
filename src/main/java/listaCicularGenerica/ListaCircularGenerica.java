package listaCicularGenerica;

public class ListaCircularGenerica<A> {

    private Nodo<A> inicio;
    private Nodo<A> ultimo;

    public ListaCircularGenerica() {
    }

    public ListaCircularGenerica(Nodo<A> inicio, Nodo<A> ultimo) {
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
        }else{
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
        }else{
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        }
    }

    void mostrar() {
        Nodo<A> aux = inicio;
        while (aux != null) {
            System.out.println("["+ aux.getDato()+"]");
            aux = aux.getSiguiente();
        }
    }

}
