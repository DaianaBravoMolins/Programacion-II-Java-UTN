
package ejercicio13;

public class GeneradorQR {
   

    public void generar(int valor, Usuario usuario) {
        CodigoQr codigo = new CodigoQr(valor, usuario);
        codigo.mostrarInfo();
    }
}

