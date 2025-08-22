package programacionestructurada;

// Bravo Molins Daiana - Trabajo Practico 2 Programacion Estructurada
//Ejercicio 11

import java.util.Scanner;

public class ProgramacionEstructurada11 {
    
    static final double EJEMPLOENTRADASALIDA = 0.10;

    public static void main(String[] args) {
    
    /*Cálculo de descuento especial usando variable global.
    Declara una variable global Ejemplo de entrada/salida: = 0.10. 
    Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable global 
    para calcular el descuento especial del 10%.
    Dentro del método, declara una variable local descuentoAplicado, 
    almacena el valor del descuento y muestra el precio final con descuento.
    Ejemplo de entrada/salida:
    Ingrese el precio del producto: 200
    El descuento especial aplicado es: 20.0
    El precio final con descuento es: 180.0  */
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese el precio: ");
    double precio = Double.parseDouble(scan.nextLine());    
    
    double precioFinal = calcularDescuentoEspecial(precio);
    System.out.println("El precio final con descuento es: " + precioFinal);
    
    }
    
    static double calcularDescuentoEspecial(double precio){
        double descuentoAplicado = EJEMPLOENTRADASALIDA * precio;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        double precioFinal = precio - descuentoAplicado;
        return precioFinal;
    }
}
