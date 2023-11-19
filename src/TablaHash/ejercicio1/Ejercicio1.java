/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablaHash.ejercicio1;

import java.util.Hashtable;

/**
 *
 * @author estudiante
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Hashtable<String, String> hash= new Hashtable<>(20);
        hash.put("1152341", "Royner");
        hash.put("1152348", "Juan");
        hash.put("1152332", "Allison");
        hash.put("1152334", "Nicol");
        System.out.println("Nombre: " + hash.get("1152348"));
    }
}
