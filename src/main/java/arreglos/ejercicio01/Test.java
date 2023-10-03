package arreglos.ejercicio01;

public class Test {

    public static void main(String[] args) {

        Viaje viaje = new Viaje("España.");
        viaje.add(new Gasto(50000, 1));
        viaje.add(new Gasto(80000, 2));
        viaje.add(new Gasto(100000, 3));
        viaje.add(new Gasto(60000, 4));
        viaje.add(new Gasto(40000, 1));
        
        viaje.imprimir();
        System.out.println("Gastos totales: "+viaje.gastosTotales());
        System.out.println("Gastos totales en comida: "+viaje.gastoComida());
        System.out.println("Mayor gasto: "+viaje.gastoMayor());
        
    }
}
