
package programacionestructurada;

// Bravo Molins Daiana - Trabajo Practico 2 Programacion Estructurada
//Ejercicio 6
import java.util.Scanner;

public class ProgramacionEstructurada06 {
    public static void main(String[] args) { 
    
        /*
        Contador de Positivos, Negativos y Ceros (for).
        Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son ceros.
        Ejemplo de entrada/salida:
        Ingrese el número 1: -5
        Ingrese el número 2: 3
        Ingrese el número 3: 0
        Ingrese el número 4: -1
        Ingrese el número 5: 6
        Ingrese el número 6: 0
        Ingrese el número 7: 9
        Ingrese el número 8: -3
        Ingrese el número 9: 4
        Ingrese el número 10: -8
        Resultados:
        Positivos: 4
        Negativos: 4
        Ceros: 2
        */
        
        Scanner scan = new Scanner (System.in);
        
        int contadorPostitivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        
        for (int i = 0; i < 11; i++) {
            System.out.println("Ingrese un numero: ");
            int numeroIngresado = Integer.parseInt(scan.nextLine());  
            if (numeroIngresado > 0) {
                contadorPostitivos += 1;
                
            } else if(numeroIngresado < 0){
                contadorNegativos += 1;
            } else{
                contadorCeros += 1;
            }
        }
     
        System.out.println("El resultado es: \nCantidad positivos " + contadorPostitivos + "\nCantidad negativos: " + contadorNegativos + "\nCantidad de ceros: " + contadorCeros);
         
    }
}
