
package biblioteca_y_libros;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    // agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor)
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }
    
    // listarLibros()
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        System.out.println("Libros en la biblioteca '" + nombre + "':");
        for (Libro l : libros) {
            l.mostrarInfo();
            System.out.println("----------------------------");
        }
    }

    // buscarLibroPorIsbn(String isbn)
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    // eliminarLibro(String isbn)
    public void eliminarLibro(String isbn) {
        boolean eliminado = libros.removeIf(l -> l.getIsbn().equals(isbn));
        if (eliminado)
            System.out.println("Libro con ISBN " + isbn + " eliminado.");
        else
            System.out.println("No se encontró ningún libro con ese ISBN.");
    }

    // obtenerCantidadLibros()
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    // filtrarLibrosPorAnio(int anio)
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("Libros publicados en el año " + anio + ":");
        boolean encontrado = false;
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
                System.out.println("----------------------------");
                encontrado = true;
            }
        }
        if (!encontrado)
            System.out.println("No se encontraron libros de ese año.");
    }

    // mostrarAutoresDisponibles()
    public void mostrarAutoresDisponibles() {
        System.out.println("Autores disponibles en la biblioteca:");
        ArrayList<String> nombresAutores = new ArrayList<>();
        for (Libro l : libros) {
            String nombre = l.getAutor().getNombre();
            if (!nombresAutores.contains(nombre)) {
                nombresAutores.add(nombre);
                l.getAutor().mostrarInfo();
            }
        }        
    }
}

