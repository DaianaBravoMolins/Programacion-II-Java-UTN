
package ejercicio6;

public class Reserva {
    private String fecha;
    private String hora;
    private Mesa mesa;
    private Cliente cliente;
    
    public Reserva(String fecha, String hora, Mesa mesa, Cliente cliente){
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
        this.cliente = cliente;
    }
    
    public void mostrarMesa(){
        System.out.println("La reserva, del dia " + fecha + "a las " + hora + "corresponde a la mesa: " + mesa.getNumero());
    }
    
     public void mostrarCliente(){
        System.out.println("La reserva corresponde al cliente: " + cliente.getNombre());
    }
    
    
    public String getFecha(){
        return fecha;
    }
    
    public String getHora(){
        return hora;
    }
    


    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", mesa=" + mesa + ", cliente=" + cliente + '}';
    }
    
    
}

    
