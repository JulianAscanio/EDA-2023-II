
package listas.ejercicio5;

public class Gasto {
    int tipo;
    double valor;

    public Gasto() {
    }

    public Gasto(int tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Gasto: " + "tipo=" + tipo + ", valor= $" + valor;
    }
    
    
}
