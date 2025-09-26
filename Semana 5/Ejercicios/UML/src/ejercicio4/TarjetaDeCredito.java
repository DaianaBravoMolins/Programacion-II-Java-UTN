
package ejercicio4;

public class TarjetaDeCredito {

    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; //referencia a cliente asociado
    
    public TarjetaDeCredito(String numero, String fechaVencimiento){
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public void setCliente (Cliente cliente){
        this.cliente = cliente;
        if(cliente != null && cliente.getTarjetaDeCredito() != this){
            cliente.setTarjetaDeCredito(this);
        }
    }
    
    public String getNumero(){
        return numero; 
    }
    
     public String getFechaVencimiento(){
        return fechaVencimiento; 
    }
     
     public Cliente getCliente(){
         return cliente;
     }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", cliente=" + cliente + '}';
    }
     
   
}
    
