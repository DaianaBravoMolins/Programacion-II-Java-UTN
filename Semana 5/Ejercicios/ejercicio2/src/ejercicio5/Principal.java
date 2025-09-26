
package ejercicio5;

public class Principal {
    public static void main(String[] args) {
        
        PlacaMadre placaMadre= new PlacaMadre("ASUS ROG Strix B550-F", "B550", "Placa con soporte para PCIe 4.0");
        Propietario propietario = new Propietario("Blanca Demarcico", 35343532);
        Computadora computadora = new Computadora("Lenovo", 3532, "Placa con soporte para DDR5 y PCIe 4.0");
        
  
        propietario.setComputadora(computadora);
        
        System.out.println(placaMadre);
        
        System.out.println(computadora);
        
        System.out.println(propietario);
     

    
    }
    
}
