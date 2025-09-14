package POO;

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
   
    public String getAutor() {
        return autor;
    }
        
    public String getTitulo() {
        return titulo;
    }
    
    public int getAñoPublicacion() {
        return añoPublicacion;
    }    
    
    public void setTitulo(String nuevoTitulo){
       titulo = nuevoTitulo; 
    }
    
    public void setAutor(String nuevoAutor) {
        autor = nuevoAutor;  
    }

    public void setAñoPublicacion(int nuevoAñoPublicacion) {
        if(nuevoAñoPublicacion <= 1903 || nuevoAñoPublicacion > 1950){   //Periodo de tiempo de vida del autor
            System.out.println("El año de publicacion modificacdo es erroneo. Reintente");
        }
        
        else{
            System.out.println("El año se modifico correctamente.");
            añoPublicacion = nuevoAñoPublicacion;       
        }
    }
}