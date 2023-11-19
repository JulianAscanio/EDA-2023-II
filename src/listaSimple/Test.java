package listaSimple;

public class Test {

    public static void main(String[] args) {
        ListaSimple list = new ListaSimple();
        list.addInicio(12);
        list.addInicio(16);
        list.addInicio(10);
        list.addInicio(8);
        list.addInicio(11);
        list.addFinal(20);

        list.mostrar();

        int valorBuscar = 8;

        if (list.buscar(valorBuscar)) {
            System.out.println("El valor " + valorBuscar + " está en la lista.");
        } else {
            System.out.println("El valor " + valorBuscar + " no está en la lista.");
        }

        System.out.println("Lista Actualizada.");
        list.eliminar(11);
        list.mostrar();

    }

}
