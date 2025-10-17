
package ejercicio7;

public class Motor {
    private int tipo;
    private int numeroSerie;
    
    public Motor(int tipo, int numeroSerie){
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    
    }
    
    public int getTipo(){
        return tipo;
    }
    
    public int getnumeroSerie(){
        return numeroSerie;
    }

    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo + ", numeroSerie=" + numeroSerie + '}';
    }
    
    
    
}
