package listaSimple;

public class ListaSimple {

    private Nodo inicio;
    private Nodo ultimo;

    /**
     * @return the incio
     */
    public Nodo getInicio() {
        return inicio;
    }

    /**
     * @param inicio
     */
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public void addInicio(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
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
            /*Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);*/

            ultimo.setSiguiente(nuevo);
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
        if (inicio == null) {
            System.out.println("Lista vacia.");
        }
        if (inicio.getDato() == dato) {
            inicio = inicio.getSiguiente();
            return;
        }

        Nodo anterior = null;
        Nodo aux = inicio;

        while (aux != null && aux.getDato() != dato) {
            anterior = aux;
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            anterior.setSiguiente(aux.getSiguiente());
        }else{
            System.out.println("El elemento " + dato + " no se encontró en la lista.");
        }
    }

    public void mostrar() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println("["+ aux.getDato()+"]");
            aux = aux.getSiguiente();
        }
    }

}
