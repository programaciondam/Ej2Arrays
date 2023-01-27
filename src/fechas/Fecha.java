/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fechas;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author dam
 */
public class Fecha {

    public static int[] getDiasMes() {
        return diasMes;
    }

    public static String[] getNombresMes() {
        return nombresMes;
    }

    private int dia;
    private int mes;
    private int anno;
    private static int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
private static String[] nombresMes={"ene","feb","mar","abr","may",
    "jun","jul","ag","sep","oct","nov","dic"};

    public Fecha() {
        Calendar c= new GregorianCalendar();
        dia= c.get(Calendar.DAY_OF_MONTH);
        mes= c.get( Calendar.MONTH)+1;
        anno= c.get( Calendar.YEAR);
        
                
    }
    public int calcularAnnos(){
    
        Fecha fhoy=new Fecha();
        int annos;
        annos= fhoy.getAnno()-anno;
        if ( fhoy.getMes()< this.getMes() || 
                fhoy.getMes()== this.mes &&
                fhoy.getDia()< getDia())
            annos--;
        return annos;
    }
    public int calcularAnnos(Fecha f){
    
       
        int annos;
        annos= f.getAnno()-anno;
        if ( f.getMes()< this.getMes() || 
                f.getMes()== this.mes &&
                f.getDia()< getDia())
            annos--;
        return annos;
    }
    
    public String fechaLetra(){
        return dia +"/"+ nombresMes[mes-1]+"/"+anno;
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
                if (anno < 1000 || anno > 3000) {
                    correcto = false;
                } else {
                    bisiesto();
                    if (mes < 1 || mes > 12) {
                        correcto = false;
                    } else {
                        if (dia < 1 || dia > diasMes[mes - 1]) {
                            correcto = false;
                        }
                    }
                }
            } catch (NumberFormatException ex) {
                correcto = false;
            }
        }
        return correcto;
    }

    private void bisiesto() {
        if (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0) {
            diasMes[1] = 29;
        } else {
            diasMes[1] = 28;
        }
    }
    public int calcularOrden(){
        int orden=0;
        for( int mesAnterior=0;mesAnterior<mes-1; mesAnterior++)
        {
            orden=orden+diasMes[mesAnterior];
        }
        orden=orden+dia;
        return orden;
    }
    public int calcularFinAnno()
    {
        int finAnno=numeroDiasAnno()-calcularOrden();
        return finAnno;
    }
    private int numeroDiasAnno(){
        int numDias;
          if (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0) {
            numDias=366;
        } else {
            numDias=365;
        }
          return numDias;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnno() {
        return anno;
    }
    
    
}
