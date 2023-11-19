
package arreglos.ejercicio6;

public class Test {
    public static void main(String[] args) {
        RegistroCedula registro = new RegistroCedula();
        
        registro.leerElementos();
        System.out.println("");
        registro.ordenarCedulas();
        System.out.println("Cedulas Ordenadas:");
        for (Cedula ced : registro.getCedula()) {
            System.out.println(ced.getNumero());
        }
        
        // Buscar una cédula
        int numeroBuscar = 19144473;
        int posicion = registro.buscarCedula(numeroBuscar);

        if (posicion >= 0) {
            System.out.println("El número de cédula " + numeroBuscar + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El número de cédula " + numeroBuscar + " no se encuentra en el registro.");
        }
        
        // Contar cédulas mayores
        int numero = 19145954;
        int mayores = registro.cedulaMayor(numero);
        System.out.println("Hay " + mayores + " números de cédula mayores a " + numero);
        
        System.out.println("Cedulas ordenadas:");
        registro.ordenarCedulas();
    }
}
