
package ejercicio2;


public class Principal {

  
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Mario Alejandro Pacheco", 34344232);
        Bateria bateria = new Bateria("R-H 1892" ,340000);
        Celular celular = new Celular(940332, "Samsung", "A-15", bateria, usuario);

        System.out.println(usuario);
        System.out.println(bateria);
        System.out.println(celular);

    }
    
}
