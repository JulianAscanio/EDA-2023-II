/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaSimpleGenerica;

/**
 *
 * @author Estudiante
 */
public class Test {
    public static void main(String[] args) {
        ListaSimple <String> ls = new ListaSimple<>();
        ls.addInicio("Maria");
        ls.addInicio("Pedro");
        ls.addInicio("Jose");
        ls.addFinal("Juan");
        ls.mostrar();
    }
}
