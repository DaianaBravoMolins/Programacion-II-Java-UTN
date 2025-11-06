
package ejercicios_sobre_excepciones;

import java.util.Scanner;


public class DivisiónSegura {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese el numerador: ");
            int numerador = sc.nextInt();
            System.out.print("Ingrese el denominador: ");
            int denominador = sc.nextInt();

            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        }
    }
}
