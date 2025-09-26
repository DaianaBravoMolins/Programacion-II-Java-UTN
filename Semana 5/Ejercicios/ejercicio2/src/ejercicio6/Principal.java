
package ejercicio6;

public class Principal {
    
    public static void main(String[] args){

        Cliente cliente = new Cliente("Eduardo Cisneros", 34324454);

        Mesa mesa = new Mesa(7,12);
        Reserva reserva = new Reserva("11-09-25","18:00 hs",mesa ,cliente);
        
        
        System.out.println(cliente);
        System.out.println(mesa);
        System.out.println(reserva);
            
    }
}
