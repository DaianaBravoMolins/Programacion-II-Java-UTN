
package ejercicio1;

public class Principal {
        public static void main(String[] args) {
        
        Foto foto = new Foto("Dai_32i.png", "png");
        Titular titular = new Titular ("Raul Gutierrez", 33244243);
        Pasaporte pasaporte = new Pasaporte (32334123, "2025-05-19", "imagen_pasaporte", "foto.png", titular);
        
        System.out.println("Titular: " + titular.getNombre());
        System.out.println("Pasaporte N°: " + pasaporte.getNumero());
        System.out.println("Foto formato: " + pasaporte.getFoto().getFormato());
        System.out.println("El pasaporte de " + titular.getNombre() + " es: " + titular.getPasaporte().getNumero());
        
        }
}
        
