package animales_y_comportamiento_sobrescrito;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
         
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Cartucho"));
        animales.add(new Gato("Cali"));
        animales.add(new Vaca("Cecilia"));

        // Mostrar descripción y sonido de cada animal
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido(); 
            System.out.println("---");
        }
    }
}
            
 
  
