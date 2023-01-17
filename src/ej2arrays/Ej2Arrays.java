/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2arrays;

import fechas.Fecha;

/**
 *
 * @author dam
 */
public class Ej2Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha fecha=Fechas.pedirFecha(" Introduce la fecha");
        int orden=  fecha.calcularOrden();
        System.out.println("El número de orden es:"+
             orden );
        System.out.println("Quedan :"+ fecha.calcularFinAnno()+
                " para que acabe el año");
    }

   

}
