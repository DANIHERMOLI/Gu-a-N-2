
import java.util.Scanner;
/**
 * Este programa esta diseñado para hallar los impuestos de vehiculos
 * 
 * @author (your name) 
 * @version (4.0)
 */
public class Impuestos
{
    public static void main(String[] args)
    {
        
         Scanner teclado = new Scanner(System.in);
        //Datos de entrada
        double precioc,precioa;
        //Datos de salida
        double impuestoc,impuestom,preciob;
        //Preguntas de entrada
        System.out.print("Ingrese el valor de la camioneta");
        precioc = teclado.nextDouble();
        System.out.print("Ingrese el valor del automovil");
        precioa = teclado.nextDouble();
        //Cálculos
        if (precioc>=80)
        {
          impuestoc =precioc/2;
        }
        else
        {
           impuestoc = 0;
        }   
   
         
        if (precioa>20)
         {
           impuestom = precioa/5;
         }
        else
         {
            impuestom = 5;
        }
        if (precioa<40)
         {
           impuestom = precioa/5;
         }
        else
         {
            impuestom = 9;
        }
      
     
         //Mostrar datos de salida
        System.out.println("El impuesto a pagar por la camioneta es" + impuestoc);
        System.out.println("El impuesto a pagar por el automovil es" + impuestom);
        System.out.println("El precio neto de la camioneta es" + precioc+impuestoc);
        System.out.println("El precio neto del automovil es" + precioa+impuestom);
    
    
      
    }
}
