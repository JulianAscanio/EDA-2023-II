package listaCicularGenerica;

public class Test {

    public static void main(String[] args) {
        ListaCircularGenerica<Integer> list = new ListaCircularGenerica<>();
        list.addInicio(12);
        list.addInicio(16);
        list.addFinal(10);
        list.addInicio(8);
        list.addInicio(11);
        list.addFinal(20);

        list.mostrar();
    }
}
