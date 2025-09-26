
package ejercicio5;


public class Computadora {
    private String marca;
    private int numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario; 
    
    public Computadora(String marca, int numeroSerie, String detallePlacaMadre){
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(detallePlacaMadre);
    }
    
    public void mostrarPlacaMadre(){
        System.out.println("La computadora: " + marca + "tiene una placa madre: " + placaMadre.getDetallePlacaMadre());    
    }
    
    public void setPropietario(Propietario propietario){
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        }
    }
    
    public String getMarca(){
        return marca; 
    }
    
    public int getNumeroSerie(){
        return numeroSerie; 
    }
    
    public Propietario getPropietario(){
        return propietario; 
    }

  @Override
public String toString() {
    return "Computadora{" +
           "marca=" + marca +
           ", numeroSerie=" + numeroSerie +
           ", placaMadre=" + (placaMadre != null ? placaMadre.getDetallePlacaMadre() : "sin placa") +
           "}";
}

}