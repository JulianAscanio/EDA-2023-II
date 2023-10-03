
package arreglos.ejercicio02;

public class Test {
    public static void main(String[] args) {
        RegistroCedula registro = new RegistroCedula();
        
        registro.leerElementos();
        registro.ordenarCedulas();
        
        // Buscar una cédula
        int numeroBuscar = 19144473;
        int posicion = registro.buscarCedul(numeroBuscar);

        if (posicion >= 0) {
            System.out.println("El número de cédula " + numeroBuscar + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El número de cédula " + numeroBuscar + " no se encuentra en el registro.");
        }
        
        // Contar cédulas mayores a un límite
        int numero = 19145954;
        int mayores = registro.cedulaMayor(numero);
        System.out.println("Hay " + mayores + " números de cédula mayores a " + numero);
    }
}
