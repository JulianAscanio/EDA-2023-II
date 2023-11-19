package listaCicularDoble;

public class Nodo<A> {

    private A dato;
    private Nodo<A> siguiente;
    private Nodo<A> anterior;

    public Nodo() {
    }

    public Nodo(A dato, Nodo<A> siguiente, Nodo<A> anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
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

    /**
     * @return the anterior
     */
    public Nodo<A> getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodo<A> anterior) {
        this.anterior = anterior;
    }

}
