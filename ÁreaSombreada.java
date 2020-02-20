import java.util.Scanner;
/**
 * Este programa esta diseñado para hallar el área sombreada de un cuadrado entre un circulo
 * 
 * @author (Daniela) 
 * @version (2.0)
 */
public class ÁreaSombreada
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        //Datos de entrada
        double lado, radio;
        //Datos de salida
        double areasombreada;
        //Preguntas de entrada
    
        System.out.print("Escriba el valor del radio");
        radio = teclado.nextDouble();
        //Calculos
        lado = Math.pow(radio,2) * 2;
        radio = Math.pow(radio,2) * Math.PI;
        areasombreada = radio - lado; 
        //Mostrar datos de salida
        System.out.println("El área sombreada de la figura es" + areasombreada);
    }
}
