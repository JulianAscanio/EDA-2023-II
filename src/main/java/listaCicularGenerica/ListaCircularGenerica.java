package listaCircular;

public class ListaCircular {

    private Nodo inicio;
    private Nodo ultimo;

    public ListaCircular() {
    }

    public ListaCircular(Nodo inicio, Nodo ultimo) {
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
        
    }

    void addFinal(int dato) {
    }

    void mostrar(int dato) {
    }

}
