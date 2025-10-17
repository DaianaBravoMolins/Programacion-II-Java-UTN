
package ejercicio11;


public class Principal {
     
    public static void main(String[] args) {

        Artista artista1 = new Artista("Shakira", "Pop");
        Artista artista2 = new Artista("Coldplay", "Rock");

        Cancion cancion1 = new Cancion("Hips Don't Lie", artista1);
        Cancion cancion2 = new Cancion("Yellow", artista2);

        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(cancion1);
        reproductor.reproducir(cancion2);
    }
}

