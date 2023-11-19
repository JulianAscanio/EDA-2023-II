/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas.ejercicio5;

/**
 *
 * @author 1151865
 */
public class Test {
    public static void main(String[] args) {
        Viaje v = new Viaje("España");
        v.add(new Gasto(1,50000));
        v.add(new Gasto(4,20000));
        v.add(new Gasto(2,80000));
        v.add(new Gasto(3,100000));
        v.add(new Gasto(1,45000));
        
        v.mostrar();
        System.out.println("Gastos totales: "+v.calcularGastos());
        System.out.println("Gastos totales en comida: "+v.gastoComida());
        System.out.println("Mayor gasto: "+v.mayorGasto());
    }
}
