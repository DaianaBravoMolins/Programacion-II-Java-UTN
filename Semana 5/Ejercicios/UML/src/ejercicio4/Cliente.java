
package ejercicio4;


public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjetaDeCredito; // Referencia a Tarjeta de credito asociada
    
    public Cliente (String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
    }
 
    public void setTarjetaDeCredito (TarjetaDeCredito tarjetaDeCredito){
        this.tarjetaDeCredito = tarjetaDeCredito;
        if(tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this){
            tarjetaDeCredito.setCliente(this);
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getDni(){
        return dni;
    }
    
    public TarjetaDeCredito getTarjetaDeCredito(){
        return tarjetaDeCredito;
    }

    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni +  ", tarjetaNumero=" + (tarjetaDeCredito != null ? tarjetaDeCredito.getNumero() : "sin tarjeta") +'}';
    }   
    
}
