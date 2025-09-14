package programacionestructurada;

// Bravo Molins Daiana - Trabajo Practico 2 Programacion Estructurada
//Ejercicio 13

import java.util.Scanner;

public class ProgramacionEstructurada13 {
    
    public static void main(String[] args) {
    /*
        Impresión recursiva de arrays antes y después de modificar un elemento.
        Crea un programa que:
        a. Declare e inicialice un array con los precios de algunos productos.
        b. Use una función recursiva para mostrar los precios originales.
        c. Modifique el precio de un producto específico.
        d. Use otra función recursiva para mostrar los valores modificados.
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
        Precio: $89.99                  */
    
        double[] precioProductosComputacion = {199.99, 299.5, 149.75, 399.0, 89.99};
         
        System.out.println("Precios originales: ");
        recursividadPreciosOriginales(precioProductosComputacion,0);
   
        precioProductosComputacion[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        recursividadPreciosOriginales(precioProductosComputacion,0);
    }
    //void porque no devuelve nada solo imprime
    
    static void recursividadPreciosOriginales (double [] precioProductosComputacion, int i){
        if (i == precioProductosComputacion.length){
            return;
        } else{
            System.out.println("Precio: $ " + precioProductosComputacion[i]);
            recursividadPreciosOriginales(precioProductosComputacion, i+1);
        }
    }



}