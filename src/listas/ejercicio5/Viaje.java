package listas.ejercicio5;

import listaDobleGenerica.ListaDoble;

public class Viaje {

    private String destino;
    ListaDoble<Gasto> gastos;

    public Viaje(String destino) {
        this.destino = destino;
        gastos = new ListaDoble<>();
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public boolean add(Gasto gasto) {
        if (gastos.addFinal(gasto)) {
            return false;
        } else {
            return true;
        }
    }

    public double calcularGastos() {
        double total = 0;
        for (Gasto gasto : gastos.obtenerElementos()) {
            total += gasto.getValor();
        }
        return total;
    }

    public double gastoComida() {
        double total = 0;
        for (Gasto gasto : gastos.obtenerElementos()) {
            if (gasto.getTipo() == 1) {
                total += gasto.getValor();
            }
        }
        return total;
    }

    public double mayorGasto() {
        if (gastos.obtenerElementos() == null) {
            return 0.0;
        } else {

            double mayor = 0.0;
            for (Gasto gasto : gastos.obtenerElementos()) {
                if (gasto.getValor() > mayor) {
                    mayor = gasto.getValor();
                }
            }
            return mayor;
        }
    }

    public void mostrar() {
        gastos.mostrar();
    }
}
