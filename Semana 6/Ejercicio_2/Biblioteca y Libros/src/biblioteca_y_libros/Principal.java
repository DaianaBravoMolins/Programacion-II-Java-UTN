
package biblioteca_y_libros;

public class Principal {
    public static void main(String[] args) {
        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Municipal de San Martín");

        // Crear autores
        Autor a1 = new Autor("A1", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A2", "Julio Cortázar", "Argentina");
        Autor a3 = new Autor("A3", "Jane Austen", "Británica");

        // 1- AgregarLibro(isbn, titulo, nioPublicacion, autor)

        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN002", "Crónica de una muerte anunciada", 1981, a1);
        biblioteca.agregarLibro("ISBN003", "Rayuela", 1963, a2);
        biblioteca.agregarLibro("ISBN004", "Orgullo y prejuicio", 1813, a3);
        biblioteca.agregarLibro("ISBN005", "Emma", 1815, a3);

        // 2- listarLibros
        biblioteca.listarLibros();

        // 3- buscarLibroPorIsbn
        System.out.println("Buscando libro ISBN003...");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (buscado != null) buscado.mostrarInfo();

        // 4- eliminarLibro(String isbn)
        biblioteca.eliminarLibro("ISBN002");
        biblioteca.listarLibros();

        // 5- obtenerCantidadLibros()
        System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // 6- Filtrar libros por año 
        biblioteca.filtrarLibrosPorAnio(1813);
        
        // 7- Mostrar autores disponibles
        biblioteca.mostrarAutoresDisponibles();
    }
}