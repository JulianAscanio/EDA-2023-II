/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacionAnimales;

import java.util.Hashtable;

/**
 *
 * @author estudiante
 */
public class Asociacion {

    Hashtable<Integer, Mascota> mascotas;

    public Asociacion() {
        mascotas = new Hashtable<>();
    }

    public void add(Mascota mascota) {
        mascotas.put(mascota.getId(), mascota);
    }

    public Mascota buscarId(String key) {
        return mascotas.get(key);
    }

    public Mascota buscarId(int id) {
        return mascotas.get(id);
    }

    public Mascota buscarResponsable(int cedula) {
        for (Mascota mascota : mascotas.values()) {
            if (mascota.getCedula() == cedula) {
                return mascota;
            }
        }
        return null;
    }
}
