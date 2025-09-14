
package programacionestructurada;

// Bravo Molins Daiana - Trabajo Practico 2 Programacion Estructurada
//Ejercicio 4
import java.util.Scanner;

public class ProgramacionEstructurada04 {

    final static int DESCUENTOCATA = 10;
    final static int DESCUENTOCATB = 15;
    final static int DESCUENTOCATC = 20;

    public static void main(String[] args) { 
    /*4. Calculadora de Descuento según categoría.
    Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
    Luego, aplique los siguientes descuentos:
    Categoría A: 10% de descuento
    Categoría B: 15% de descuento
    Categoría C: 20% de descuento
    El programa debe mostrar el precio original, el descuento aplicado y el precio final
    Ejemplo de entrada/salida:
    Ingrese el precio del producto: 1000
    Ingrese la categoría del producto (A, B o C): B
    Descuento aplicado: 15%
    Precio final: 850.0
    */
    Scanner scan = new Scanner (System.in);
    System.out.println("Ingrese el precio del producto: ");
    double precioProducto = Double.parseDouble(scan.nextLine());
    
    System.out.println("Ingrese su categoria: ");
    char categoriaIngresada = scan.nextLine().charAt(0);
    double precioFinal;
    
    System.out.println("El precio original del producto es: " + precioProducto);

        switch (categoriaIngresada) {
            case 'A':
                precioFinal = (precioProducto * DESCUENTOCATA) / 100;
                System.out.println("Se aplico un " + DESCUENTOCATA + " % de descuento.");
                System.out.println("El precio final del producto es: " + precioFinal);
                break;
            case 'B':
                precioFinal = (precioProducto * DESCUENTOCATB) / 100;
                System.out.println("Se aplico un " + DESCUENTOCATB + " % de descuento.");
                System.out.println("El precio final del producto es: " + precioFinal);
                break;
            case 'C':
                precioFinal = (precioProducto * DESCUENTOCATC) / 100;                        
                System.out.println("Se aplico un " + DESCUENTOCATC + " % de descuento.");
                System.out.println("El precio final del producto es: " + precioFinal);
                break;
            default:
                System.out.println("La letra indicada no corresponde a una categoria.");
        }
    
    } 
}
    

