
package listaDoble;

public class Test {
    public static void main(String[] args) {
        ListaDoble list = new ListaDoble();
        list.addInicio(12);
        list.addInicio(16);
        list.addFinal(10);
        list.addInicio(8);
        list.addInicio(11);
        list.addFinal(20);

        list.mostrar();
        int datoBuscar = 12;
        System.out.println("");
        if (list.buscar(datoBuscar)) {
            System.out.println("El dato "+datoBuscar+" se encuentra en la lista.");
        }else{
            System.out.println("El dato "+datoBuscar+" No se encuentra en la lista.");
        }
    }
}
