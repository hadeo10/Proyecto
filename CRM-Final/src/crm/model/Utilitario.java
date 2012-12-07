/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.model;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author hector
 */
public class Utilitario {


	public static int aleatorioRango(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
	
	public static Date fechaAleatoria(){
		int year = aleatorioRango(1980, 2012);
        int month = aleatorioRango(0, 11);
        GregorianCalendar gc = new GregorianCalendar(year, month, 1);
        int day = aleatorioRango(1, gc.getActualMaximum(Calendar.DAY_OF_MONTH));
        gc.set(year, month, day);
        //System.out.println(gc.get(Calendar.DAY_OF_MONTH) + "/" + gc.get(Calendar.MONTH) + "/" + gc.get(Calendar.YEAR));
        return gc.getTime();
	}
	
	public static double redondear(double numero) {
		return redondear(numero, UConstantes.NUMERO_DECIMALES);
	}
	
	public static double redondear(double numero, int digitos) {
		int cifras = (int) Math.pow(10, digitos);
		return Math.rint(numero * cifras) / cifras;
	}
}
   
