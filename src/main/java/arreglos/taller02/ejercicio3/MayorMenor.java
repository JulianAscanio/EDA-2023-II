
package arreglos.taller02.ejercicio3;

public class MayorMenor {
    
    int[] matriz;

    public MayorMenor() {
    }

    public MayorMenor(int[] matriz) {
        this.matriz = matriz;
    }

    public int[] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[] matriz) {
        this.matriz = matriz;
    }
    
    public void encontrarMayorMenor(){
        if (matriz.length == 0) {
            System.out.println("Matriz vacia.");
        }else{
            int mayor = matriz[matriz.length -1];
            int menor = matriz[0];
            
            System.out.println("El mayor es: "+mayor);
            System.out.println("El menor es: "+menor);
        }
    }
}
