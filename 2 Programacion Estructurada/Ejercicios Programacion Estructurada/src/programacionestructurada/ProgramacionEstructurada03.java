package programacionestructurada;
// Bravo Molins Daiana - Trabajo Practico 2 Programacion Estructurada
//Ejercicio 3

import java.util.Scanner;

public class ProgramacionEstructurada03 {

    public static void main(String[] args) {
        
    /* Clasificación de Edad.
    Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
    Menor de 12 años: "Niño"
    Entre 12 y 17 años: "Adolescente"
    Entre 18 y 59 años: "Adulto"
    60 años o más: "Adulto mayor"
    Ejemplo de entrada/salida:
    Ingrese su edad: 25
    Eres un Adulto.
    Ingrese su edad: 10
    Eres un Niño.
    */
    
    Scanner scan = new Scanner (System.in);
    System.out.println("Ingrese su edad, por favor: ");
    int edadIngresada = Integer.parseInt(scan.nextLine());
    
        if (edadIngresada < 12) {
            System.out.println("Niño.");
        } else if (edadIngresada >= 12 && edadIngresada <= 17) {
                System.out.println("Adolescente.");
            } else if(edadIngresada >= 18 && edadIngresada <= 59){
                    System.out.println("Adulto.");
                } else {
                    System.out.println("Adulto mayor.");
                }      
    }
    
}