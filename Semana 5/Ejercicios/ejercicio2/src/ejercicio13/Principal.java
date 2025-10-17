
package ejercicio13;


public class Principal {
    
    public static void main(String[] args) {

        Usuario usuario = new Usuario("María Gómez", "maria.gomez@email.com");

        GeneradorQR generador = new GeneradorQR();
        generador.generar(2025001, usuario);
    }
    
}
