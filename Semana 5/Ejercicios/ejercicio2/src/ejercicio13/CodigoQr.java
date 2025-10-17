
package ejercicio13;


public class CodigoQr {
    private int valor;
    private Usuario usuario;

    
    public CodigoQr(int valor, Usuario usuario){
        this.valor = valor;
        this.usuario = usuario; 
    }
    
    public int getValor(){
        return valor;
    }
    
     public Usuario getUsuario(){
        return usuario;
    }
     
    public void mostrarInfo(){
        System.out.println("Codigo QR " + valor + " generado por el usuario: " + usuario.getNombre());
    }
}
