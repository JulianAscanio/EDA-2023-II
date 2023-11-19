/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacionAnimales;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Test {

    public static void main(String[] args) {
        Asociacion asociacion = new Asociacion();
        asociacion.add(new Mascota(1, "firulais", 15, 123456789));
        asociacion.add(new Mascota(2, "firu", 15, 123456788));
        asociacion.add(new Mascota(3, "lais", 15, 123456787));
        asociacion.add(new Mascota(4, "fir", 15, 123456784));

        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite su cedula:"));
        System.out.println( asociacion.buscarResponsable(cedula));
        
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id de mascota:"));
        System.out.println(asociacion.buscarId(id));
    }
}
