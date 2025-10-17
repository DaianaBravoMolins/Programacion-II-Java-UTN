
package ejercicio12;

public class Impuesto {
    private int monto;
    private Contribuyente contribuyente;
    
    
    public Impuesto(int monto, Contribuyente contribuyente){
        this.monto = monto;
        this.contribuyente = contribuyente;
    }
    
    public int getMonto(){
        return monto;
    }
    
    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente + '}';
    }

}
    