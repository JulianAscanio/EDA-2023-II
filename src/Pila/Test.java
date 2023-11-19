/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

/**
 *
 * @author estudiante
 */
public class Test {
    
    public static void main(String[] args) {
        Pila p = new Pila();
        p.apilar("Maria");
        p.apilar("Jose");
        p.apilar("Pedro");
        System.out.println("Dato: " + p.desapilar());
        System.out.println("Dato: " + p.desapilar());
        System.out.println("Dato: " + p.desapilar());
        System.out.println("Dato: " + p.desapilar());
    }    
}
