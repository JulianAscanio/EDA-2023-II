package arreglos.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Viaje {

    private String destino;
    private List<Gasto> gastos;

    public Viaje() {
    }

    public Viaje(String destino) {
        this.destino = destino;
        gastos = new ArrayList();
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

    /**
     * @return the gastos
     */
    public List getGastos() {
        return gastos;
    }

    /**
     * @param gastos the gastos to set
     */
    public void setGastos(List gastos) {
        this.gastos = gastos;
    }

    public double gastosTotales() {
        double total = 0;
        for (int i = 0; i < gastos.size(); i++) {
            total += gastos.get(i).getValor();
        }
        return total;

    }

    public double gastoComida() {
        double totalComida = 0;
        for (int i = 0; i < gastos.size(); i++) {
            if (gastos.get(i).getTipo() == 1) {
                totalComida += gastos.get(i).getValor();
            }
        }
        return totalComida;
    }

    public double gastoMayor() {
        double mayor = 0;
        for (int i = 0; i < gastos.size(); i++) {
            if (gastos.get(i).getValor() > mayor) {
                mayor = gastos.get(i).getValor();
            }
        }
        return mayor;

    }

    public boolean add(Gasto gasto) {

        if (gastos.add(gasto)) {
            return true;
        }
        return false;

    }

    public void imprimir() {
        gastos.toString();
    }

}
