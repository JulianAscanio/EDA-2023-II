package arreglos.ejercicio02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RegistroCedula {

    ArrayList<Cedula> cedula;

    public RegistroCedula() {
        cedula = new ArrayList();
    }

    public ArrayList<Cedula> getCedula() {
        return cedula;
    }

    public void setCedula(ArrayList<Cedula> cedula) {
        this.cedula = cedula;
    }

    //Leer los 100 elementos por teclado.
    public void leerElementos() {
        Scanner lista = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros de cedula:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Cédula " + (i + 1) + ": ");
            int numeroCedula = lista.nextInt();
            cedula.add(new Cedula(numeroCedula));
        }
    }

    //Ordenar los números de cédula de forma ascendente.
    public void ordenarCedulas() {
        Collections.sort(cedula, (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
    }

    //Buscar si el número de cédula 19144473 se encuentra en el arreglo CEDULA e indicar la posición que ocupa.
    public int buscarCedul(int numCedula){
        for (int i = 0; i < cedula.size(); i++) {
            if (cedula.get(i).getNumero() == numCedula) {
                return i;
            }
        }
        return -1;
    }
    
    //Determinar cuántos números de cédula son mayores a 19145954.
    public int cedulaMayor(int numCedula){
        int contadorMayor = 0;
        for (Cedula cedulas : cedula) {
            if (cedulas.getNumero() > numCedula) {
                contadorMayor++;
            }
        }
        return contadorMayor;
        
    }
}
