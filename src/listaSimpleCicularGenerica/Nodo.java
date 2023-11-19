package listaSimpleCicularGenerica;

public class Nodo<A> {

    private A dato;
    private Nodo<A> siguiente;

    public Nodo() {
    }

    public Nodo(A dato, Nodo<A> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    /**
     * @return the dato
     */
    public A getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(A dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public Nodo<A> getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo<A> siguiente) {
        this.siguiente = siguiente;
    }
}
