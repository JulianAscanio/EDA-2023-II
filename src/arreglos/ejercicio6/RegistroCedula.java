package arreglos.ejercicio6;

import java.util.ArrayList;
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

    public void leerElementos() {
        Scanner lista = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros de cedula:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Cédula " + (i + 1) + ": ");
            int numeroCedula = lista.nextInt();
            cedula.add(new Cedula(numeroCedula));
        }
    }

    public void ordenarCedulas() {
        int n = cedula.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cedula.get(j).getNumero() < cedula.get(j + 1).getNumero()) {
                    Cedula temp = cedula.get(j);
                    cedula.set(j, cedula.get(j + 1));
                    cedula.set(j + 1, temp);
                }
            }
        }
    }

    public int buscarCedula(int numCedula) {
        for (int i = 0; i < cedula.size(); i++) {
            if (cedula.get(i).getNumero() == numCedula) {
                return i;
            }
        }
        return +1;
    }

    public int cedulaMayor(int numCedula) {
        int contadorMayor = 0;
        for (Cedula cedulas : cedula) {
            if (cedulas.getNumero() > numCedula) {
                contadorMayor++;
            }
        }
        return contadorMayor;

    }
}
