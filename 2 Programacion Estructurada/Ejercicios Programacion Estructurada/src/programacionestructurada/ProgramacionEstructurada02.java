
package programacionestructurada;

// Bravo Molins Daiana - Trabajo Practico 2 Programacion Estructurada
//Ejercicio 2
import java.util.Scanner;

public class ProgramacionEstructurada02 {
    public static void main(String[] args) {
    /* Determinar el Mayor de Tres Números.
    Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
    Ejemplo de entrada/salida:
    Ingrese el primer número: 8
    Ingrese el segundo número: 12
    Ingrese el tercer número: 5
    El mayor es: 12
    */    
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Ingrese un numero: ");
    int primerNumeroIngresado = Integer.parseInt(scan.nextLine()); 
    
    System.out.println("Ingrese un segundo numero: ");
    int segundoNumeroIngresado = Integer.parseInt(scan.nextLine()); 
    
    System.out.println("Ingrese un tercer numero: ");
    int tercerNumeroIngresado = Integer.parseInt(scan.nextLine()); 
    
    if ( primerNumeroIngresado > segundoNumeroIngresado && primerNumeroIngresado > tercerNumeroIngresado) {
        System.out.println("El numero " + primerNumeroIngresado + " es el mayor.");
    } else if (segundoNumeroIngresado > primerNumeroIngresado && segundoNumeroIngresado > tercerNumeroIngresado) {
            System.out.println("El numero " + segundoNumeroIngresado + " es el mayor.");
        } else {
            System.out.println("El numero " + tercerNumeroIngresado + " es el mayor.");
        }
    } 
    
    
}