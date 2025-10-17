
package ejercicio13;

public class Usuario {

    private String nombre;
    private String mail;
    
    public Usuario(String nombre, String mail){
        this.nombre = nombre;
        this.mail = mail;
    }
    
    public String getNombre(){
        return nombre;
    }
            
      public String getMail(){
        return mail;
    }
}
