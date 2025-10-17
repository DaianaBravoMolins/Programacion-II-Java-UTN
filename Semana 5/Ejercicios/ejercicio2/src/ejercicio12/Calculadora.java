
package ejercicio12;


public class Calculadora {

    
    private int impuesto;

    public Calculadora (int impuesto){
        this.impuesto = impuesto;
    }
    
    public int getImpuesto(){
        return impuesto;
    }   
    

    public void calcular(Impuesto impuesto){
        System.out.println("Calculando " + impuesto.getMonto() + "para el contribuyente " + impuesto.getContribuyente().getNombre());
    }
                
    }



