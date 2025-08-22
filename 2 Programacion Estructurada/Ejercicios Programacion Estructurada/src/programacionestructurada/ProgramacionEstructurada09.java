package programacionestructurada;

// Bravo Molins Daiana - Trabajo Practico 2 Programacion Estructurada
//Ejercicio 9

import java.util.Scanner;

public class ProgramacionEstructurada09 {
    final static double COSTONACIONAL = 5;
    final static double COSTOINTERNACIONAL = 10;
    
    public static void main(String[] args) {
        /*
        Composición de funciones para calcular costo de envío y total de compra.
        a. calcularCostoEnvio(double peso, String zona): 
        Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) 
        y el peso del paquete.
        Nacional: $5 por kg
        Internacional: $10 por kg
        b. calcularTotalCompra(double precioProducto, double costoEnvio): 
        Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.
        Desde main(), solicita el peso del paquete, la zona de envío y 
        el precio del producto. Luego, muestra el total a pagar.
        
        Ejemplo de entrada/salida:
        Ingrese el precio del producto: 50
        Ingrese el peso del paquete en kg: 2
        Ingrese la zona de envío (Nacional/Internacional): Nacional
        El costo de envío es: 10.0
        El total a pagar es: 60.0 */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la zona de envio(Nacional/Internacional):");
        String zona = scan.nextLine();
        
        System.out.println("Ingrese el peso del producto:");
        double peso = Integer.parseInt(scan.nextLine());
        
        System.out.println("Ingreseel precio del producto:");
        double precioProducto = Integer.parseInt(scan.nextLine());
        
        Double costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo del envio es:$ " + costoEnvio);
        
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El total a pagar es: " +totalCompra);
    }
    
    
    static double calcularCostoEnvio(double peso, String zona){
        
        double costoEnvio;
        
        if ("Nacional".equals(zona)) {
            costoEnvio = peso * COSTONACIONAL;
        } else {
            costoEnvio = peso * COSTOINTERNACIONAL;
        }
        return costoEnvio;
        
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double totalCompra = costoEnvio + precioProducto;
        return totalCompra;
    }
               
}
