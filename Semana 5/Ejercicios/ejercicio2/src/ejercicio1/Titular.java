
package ejercicio1;

public class Titular {
    //atributos
    private String nombre;
    private int dni;
    private Pasaporte pasaporte; //referencia al pasaporte asociado
    //Constructor
    public Titular(String nombre, int dni){
        this.nombre =  nombre;
        this.dni = dni;
    }
    
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte = pasaporte;
        if(pasaporte != null && pasaporte.getTitular() != this){
            pasaporte.setTitular(this);
        }    
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getDni(){
        return dni;
    }
    
    public Pasaporte getPasaporte(){
        return pasaporte;
    }
   

}

