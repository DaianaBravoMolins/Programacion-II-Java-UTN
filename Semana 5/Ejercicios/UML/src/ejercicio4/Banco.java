
package ejercicio4;

public class Banco {
    private String nombre;
    private String cuit;
    private TarjetaDeCredito tarjetaDeCredito; //Agregacion 1:1
    
    public Banco (String nombre, String cuit, TarjetaDeCredito tarjetaDeCredito){
        this.nombre = nombre;
        this.cuit = cuit;
        this.tarjetaDeCredito = tarjetaDeCredito;
    }
    
    public void mostrarTarjetaDeCredito(){
        System.out.println("El banco " + nombre + "tiene asociada la tajeta de credito " + tarjetaDeCredito.getNumero());
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", cuit=" + cuit + ", tarjetaDeCredito=" + tarjetaDeCredito + '}';
    }
    
    
  
}
