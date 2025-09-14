
package programacionestructurada;

// Bravo Molins Daiana - Trabajo Practico 2 Programacion Estructurada
//Ejercicio 5
import java.util.Scanner;

public class ProgramacionEstructurada05 {
    public static void main(String[] args) { 

    /*Suma de Números Pares (while).
    Escribe un programa que solicite números al usuario y sume solo los números pares. El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados.
    Ejemplo de entrada/salida:
    Ingrese un número (0 para terminar): 4
    Ingrese un número (0 para terminar): 7
    Ingrese un número (0 para terminar): 2
    Ingrese un número (0 para terminar): 0
    La suma de los números pares es: 6 
    */
    
    Scanner scan = new Scanner (System.in);
    System.out.println("Ingrese un numero: ");
    int numeroIngresado = Integer.parseInt(scan.nextLine());
    int acumulador = 0;
    
    if (numeroIngresado == 0){
        System.out.println("No se han realizado ingresos.");
    }
    
        while (numeroIngresado != 0) {            
            if (numeroIngresado % 2 == 0){
                acumulador += numeroIngresado; 
                System.out.println("Ingrese un numero (0 para terminar): ");
            } else{
                System.out.println("Ingrese un numero (0 para terminar): ");
                }
            
            numeroIngresado = Integer.parseInt(scan.nextLine());
            }      
        
        System.out.println("La suma es de " + acumulador);
          
    }
}
