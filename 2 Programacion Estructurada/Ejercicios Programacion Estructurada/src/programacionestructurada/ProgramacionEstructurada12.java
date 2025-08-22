package programacionestructurada;

// Bravo Molins Daiana - Trabajo Practico 2 Programacion Estructurada
//Ejercicio 12

import java.util.Scanner;

public class ProgramacionEstructurada12 {
    
    public static void main(String[] args) {
        /*
        Modificación de un array de precios y visualización de resultados.
        Crea un programa que:
        a. Declare e inicialice un array con los precios de algunos productos.
        b. Muestre los valores originales de los precios.
        c. Modifique el precio de un producto específico.
        d. Muestre los valores modificados.
        Salida esperada:
        Precios originales:
        Precio: $199.99
        Precio: $299.5
        Precio: $149.75
        Precio: $399.0
        Precio: $89.99
        
        Precios modificados:
        Precio: $199.99
        Precio: $299.5
        Precio: $129.99
        Precio: $399.0
        Precio: $89.99
        */
        
        double[] precioProductosComputacion = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("El precio de los productos es: \n" + precioProductosComputacion[0]);
        System.out.println(precioProductosComputacion[1]);
        System.out.println(precioProductosComputacion[2]);  
        System.out.println(precioProductosComputacion[3]);  
        System.out.println(precioProductosComputacion[4]);  
        System.out.println();  

        precioProductosComputacion[2] = 129.99;
        
        System.out.println("Los precios actualizados son: \n" + precioProductosComputacion[0]);
        System.out.println(precioProductosComputacion[1]);
        System.out.println(precioProductosComputacion[2]);  
        System.out.println(precioProductosComputacion[3]);  
        System.out.println(precioProductosComputacion[4]);  
        System.out.println();  
        
                
    }
    
}
