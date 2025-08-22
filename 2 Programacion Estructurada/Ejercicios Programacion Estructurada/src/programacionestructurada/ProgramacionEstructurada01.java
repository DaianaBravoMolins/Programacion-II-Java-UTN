
package programacionestructurada;
// Bravo Molins Daiana - Trabajo Practico 2 Programacion Estructurada
//Ejercicio 1
import java.util.Scanner;

public class ProgramacionEstructurada01 {

    public static void main(String[] args) {

    /* Verificación de Año Bisiesto.
    Escribe un programa en Java que solicite al usuario un año y determine si es
    bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
    divisible por 400.
    Ejemplo de entrada/salida:
    Ingrese un año: 2024
    El año 2024 es bisiesto.
    Ingrese un año: 1900
    El año 1900 no es bisiesto.*/
    
    Scanner scan = new Scanner (System.in);
    
    System.out.print("Ingrese un año: ");
    int anio = Integer.parseInt(scan.nextLine());
    
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            System.out.println("El año ingresado es bisiesto.");
        } else {
            System.out.println("El año ingresado NO es bisiesto.");
        }
    }

}
        
