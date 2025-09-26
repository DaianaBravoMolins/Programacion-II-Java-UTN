
package ejercicio5;

public class Propietario {
    private String nombre;
    private int dni;
    private Computadora computadora; // referencia a computadora
    
    public Propietario(String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
    }    
    
    public void setComputadora(Computadora computadora){
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this){
             computadora.setPropietario(this);
        }
    }
    
    public String getNombre(String nombre){
        return nombre;  
    }    
    
     public int getDni(int dni){
        return dni;  
    } 
     
    public Computadora getComputadora(){
        return computadora; 
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + ", computadora=" + computadora + '}';
    }
    
    


}


