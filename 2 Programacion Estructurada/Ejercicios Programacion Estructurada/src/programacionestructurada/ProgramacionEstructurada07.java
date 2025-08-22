package programacionestructurada;

// Bravo Molins Daiana - Trabajo Practico 2 Programacion Estructurada
//Ejercicio 7
import java.util.Scanner;

public class ProgramacionEstructurada07 {

    public static void main(String[] args) {
        /*
        Validación de Nota entre 0 y 10 (do-while).
        Escribe un programa que solicite al usuario una nota entre 0 y 10. 
        Si el usuario ingresa un número fuera de este rango, 
        debe seguir pidiéndole la nota hasta que ingrese un valor válido.
        Ejemplo de entrada/salida:
        Ingrese una nota (0-10): 15
        Error: Nota inválida. Ingrese una nota entre 0 y 10.
        Ingrese una nota (0-10): -2
        Error: Nota inválida. Ingrese una nota entre 0 y 10.
        Ingrese una nota (0-10): 8
        Nota guardada correctamente.*/

        Scanner scan = new Scanner(System.in);
        int notaIngresada;

        do {
            System.out.println("Ingrese una nota entre 0 y 10 : ");
            notaIngresada = Integer.parseInt(scan.nextLine());

            if (notaIngresada < 0 || notaIngresada > 10) {
                System.out.println("Error: Nota inválida.");
            } else{
                    System.out.println("La nota se guardo correctamente.");
                  }
        } while (notaIngresada < 0 || notaIngresada > 10);

    }
}
