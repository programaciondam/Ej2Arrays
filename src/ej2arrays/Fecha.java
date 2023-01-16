/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2arrays;

/**
 *
 * @author dam
 */
public class Fecha {

    int dia;
    int mes;
    int anno;
    static int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    public boolean comprobarFecha(String fecha) {
        String[] resultado;
        boolean correcto = true;
        resultado = fecha.split("/");
        if (resultado.length != 3) {
            correcto = false;
        } else {
            try {
                dia = Integer.parseInt(resultado[0]);
                mes = Integer.parseInt(resultado[1]);
                anno = Integer.parseInt(resultado[2]);
                if ( mes <1 || mes >12){
                    correcto=false;
                }
                else{
                    if(dia <1 || dia >diasMes[mes-1]){
                        correcto=false;
                    }
                }
            } catch (NumberFormatException ex) {
                correcto = false;
            }
        }
        return correcto;
    }

}
