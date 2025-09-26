
package ejercicio3;

public class Libro {
    
    private String titulo;
    private int isbn;
    private Autor autor; //Asociacion
    private Editorial editorial; // Agregacion
    
    public Libro (String titulo, int isnb, Autor autor, Editorial editorial){
        this.titulo = titulo;
        this.isbn = isnb;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
     
    public int getIsnb(){
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }    
    
    public Autor getAutor(){
        return autor;
    }
    
    
    public void mostrarAutor(){
        if (autor != null){
            System.out.println("El libro: " + titulo + "tiene como autor: " + autor.getNombre());
        } else
        {
            System.out.println("El libro " + titulo + "tiene autor anonimo.");
        }
    }
    
    public void mostrarEditorial(){
        System.out.println("El libro " + titulo + "con isnb: " + "tiene editorial: " + editorial.getNombre());
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
}
