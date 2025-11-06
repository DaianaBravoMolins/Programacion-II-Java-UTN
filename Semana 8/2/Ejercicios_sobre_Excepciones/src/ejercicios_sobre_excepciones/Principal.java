package ejercicios_sobre_excepciones;

import java.util.Scanner;

public class Principal {
       
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        try {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad inválida: debe estar entre 0 y 120 años.");
            }
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
        
    

