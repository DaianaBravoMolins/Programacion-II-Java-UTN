package programacionestructurada;

// Bravo Molins Daiana - Trabajo Practico 2 Programacion Estructurada
//Ejercicio 10

import java.util.Scanner;

public class ProgramacionEstructurada10 {
   
    public static void main(String[] args) {
    /*
    Actualización de stock a partir de venta y recepción de productos.
    Crea un método actualizarStock(int stockActual, int cantidadVendida,
    int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción
    de productos:
    NuevoStock = StockActual − CantidadVendida + CantidadRecibida
    NuevoStock = CantidadVendida + CantidadRecibida
    Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, 
    y muestra el stock actualizado.
    Ejemplo de entrada/salida:
    Ingrese el stock actual del producto: 50
    Ingrese la cantidad vendida: 20
    Ingrese la cantidad recibida: 30
    El nuevo stock del producto es: 60 */    
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Ingrese el stock actual: ");
    int stockActual = Integer.parseInt(scan.nextLine());
    
    System.out.print("Ingrese la cantidad vendida: ");
    int cantidadVendida = Integer.parseInt(scan.nextLine());
    
    System.out.print("Ingrese la cantidad recibida: ");
    int cantidadRecibida = Integer.parseInt(scan.nextLine());
    
    int stockActualizado = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + stockActualizado);
    }
    
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    } 
}
