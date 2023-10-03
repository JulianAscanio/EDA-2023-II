package arreglos.ejercicio01;

public class Gasto {

    private double valor;
    private int tipo;

    public Gasto() {
    }

    public Gasto(double valor, int tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Gasto:" + "valor=" + valor + ",tipo:" + tipo;
    }

}
