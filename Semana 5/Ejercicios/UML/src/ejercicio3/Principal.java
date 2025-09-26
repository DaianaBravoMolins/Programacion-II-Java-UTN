
package ejercicio3;

public class Principal {
    
  
    public static void main(String[] args) {
        
        Autor autor = new Autor("Gabriel Santa Olaya","Argentino");
        Editorial editorial = new Editorial ("Planeta", "Callao 2933");
        Libro libro = new Libro("Los ojos del perro siberiano", 938409320, autor, editorial);

    
        System.out.println(autor);
        System.out.println(editorial);
        System.out.println(libro); 

        
    }
}
