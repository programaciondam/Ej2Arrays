/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2arrays;

import fechas.Fecha;
import java.util.Scanner;

/**
 *
 * @author dam
 */
public class Fechas {
     public static Fecha pedirFecha(String mensaje) {
        String fecha;
        boolean resultado2;
        Fecha miFecha = new Fecha();
        Scanner entrada = new Scanner(System.in);
        String[] resultado;
        System.out.println(mensaje);
        fecha = entrada.nextLine();
        while (!(miFecha.comprobarFecha(fecha))) {
            System.out.println("fecha incorrecta");
            System.out.println("Introduce una fecha");
            fecha = entrada.nextLine();
        }
        return miFecha;
    }
    
}
