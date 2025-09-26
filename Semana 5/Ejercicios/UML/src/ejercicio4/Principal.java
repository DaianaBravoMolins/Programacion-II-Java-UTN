
package ejercicio4;


public class Principal {   
    
    public static void main(String[] args) {
    
    TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito ("4522-2166-5454-3432", "25-11-2028");
    Banco banco = new Banco("Banco Rio","319209345", tarjetaDeCredito);
    Cliente cliente = new Cliente ("Ariana Fernandez", 34345342);
 
    //cliente.setTarjetaDeCredito(tarjetaDeCredito);
    tarjetaDeCredito.setCliente(cliente);
    
    System.out.println(tarjetaDeCredito);
    System.out.println(banco);
    System.out.println(cliente);
            
    }
}
