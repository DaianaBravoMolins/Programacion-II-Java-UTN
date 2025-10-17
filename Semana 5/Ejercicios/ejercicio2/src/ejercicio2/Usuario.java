
package ejercicio2;


public class Usuario {
    
    private String nombre;
    private int dni;
    private Celular celular;
    
    public Usuario(String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setCelular(Celular celular){
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this){
            celular.setUsuario(this);
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getDni(){
        return dni;
    }
  
    public Celular getCelular(){ //i
        return celular; 
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni +   ", celularImei=" + (celular != null ? celular.getImei() : "ninguno") + 
           '}';
    }


    
    
}
