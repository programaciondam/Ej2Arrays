/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dam
 */
public class Ej2Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fecha;
        boolean resultado2;
        Fecha miFecha = new Fecha();
        Scanner entrada = new Scanner(System.in);
        String[] resultado;
        System.out.println("Introduce una fecha");
        fecha = entrada.nextLine();
        while (!(miFecha.comprobarFecha(fecha))) {
            System.out.println("fecha incorrecta");
            System.out.println("Introduce una fecha");
            fecha = entrada.nextLine();
        }

    }

}
