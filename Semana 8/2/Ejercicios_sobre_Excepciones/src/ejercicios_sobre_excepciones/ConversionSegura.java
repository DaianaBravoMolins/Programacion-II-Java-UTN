
package ejercicios_sobre_excepciones;

import java.util.Scanner;

public class ConversionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Texto ingresado no es un número válido.");
        }
    }
    
}
