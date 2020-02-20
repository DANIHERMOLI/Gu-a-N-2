import java.util.Scanner;
/**
 * Este programa esta diseñado para resolver un ejercicios de transporte.
 * @author (Daniela) 
 * @version (3.0)
 */
public class Colectivo
{
    public static void main(String[] args)
    {
       Scanner teclado = new Scanner(System.in);
        //Datos de entrada
        int capbus, caphotel;
        //Datos de salida
        double viajes, pagoturistas, pagoconductor;
        //Preguntas de entrada
        System.out.print("¿Cual es la capacidad de personas que puede transportar el bus?");
        capbus = teclado.nextInt();
        System.out.print("¿Cual es la capacidad de turistas en el hotel?");
        caphotel = teclado.nextInt();
        //Calculos
        pagoturistas = 10.000;
        pagoconductor = 2.000;
        viajes = caphotel/capbus;
        //Mostrar datos de salida
        System.out.println("¿Cuantos viajes debe realizar el bus?" + viajes);
        System.out.println("¿Cuantos dinero deben pagar los turistas?" + pagoturistas * viajes);
        System.out.println("¿Cuanto debe pagar el conductor por viaje?" + pagoconductor * viajes);
        
    }  
}