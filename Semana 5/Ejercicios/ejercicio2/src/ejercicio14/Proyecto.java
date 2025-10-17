
package ejercicio14;

public class Proyecto {
    private String nombre;
    private int duracioMin;
    
    public Proyecto(String nombre, int duracioMin){
        this.nombre = nombre;
        this.duracioMin = duracioMin;
   
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getDuracioMin(){
        return duracioMin;
    }
    
    
}
