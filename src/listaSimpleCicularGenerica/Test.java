package listaSimpleCicularGenerica;

public class Test {

    public static void main(String[] args) {
        ListaSimpleCircularGenerica<Integer> list = new ListaSimpleCircularGenerica<>();
        list.addInicio(12);
        list.addInicio(16);
        list.addFinal(10);
        list.addInicio(8);
        list.addInicio(11);
        list.addFinal(20);

        list.mostrar();
        System.out.println("");
        list.eliminar(15);
        System.out.println("Lista actualizada");
        list.mostrar();
        System.out.println("");
        int numBuscar = 8;
        if (list.buscar(numBuscar)) {
            System.out.println("Se encontro el numero " + numBuscar + " en la lista");
        } else {
            System.out.println("No se encontro el numero " + numBuscar);
        }
    }
}
