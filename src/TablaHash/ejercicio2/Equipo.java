/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablaHash.ejercicio2;

import java.util.Hashtable;

/**
 *
 * @author estudiante
 */
public class Equipo {
    Hashtable<String, Jugadores> equipo;

    public Equipo() {
        equipo = new Hashtable<>();
    }
    
    public void add(Jugadores jugador){
        equipo.put(jugador.getCedula(), jugador);
    }

    public Jugadores obtener(String key){
        return equipo.get(key);
    }

   
    
}
