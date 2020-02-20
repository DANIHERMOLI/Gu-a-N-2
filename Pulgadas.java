
import java.util.Scanner;
/**
 * Este programa esta diseñado para hallar la conversión de medidas a pulgadas
 * @author (Daniela) 
 * @version (1.0)
 */
public class Pulgadas
{
    public static void main(String[] args)
    {
         Scanner teclado = new Scanner(System.in);
         //Datos de entrada
        double P,C,L,Y;
        //Dato de salida
        double pulgadas;
        //Preguntas datos de entrada
        System.out.print("Ingrese el valor en pies a convertir");
        P = teclado.nextDouble();
        System.out.print("Ingrese el valor en centimetros a convertir");
        C = teclado.nextDouble();
        System.out.print("Ingrese el valor en legua a convertir");
        L = teclado.nextDouble();
        System.out.print("Ingrese el valor en yardas a convertir");
        Y = teclado.nextDouble();
        //Cálculos
         P = P * 12 / 1;
         C = C * 10 / 25.4;
         L = L * 190080.02;
         Y = Y * 36;
         
   
        //Datos de salida
        System.out.println("La conversión de pies a pulgadas es" + P);
        System.out.println("La conversión de centimetros a pulgadas es" + C);
        System.out.println("La conversión de legua a pulgadas es" + L);
        System.out.println("La conversión de yardas a pulgadas es" + Y);
    }
} 
