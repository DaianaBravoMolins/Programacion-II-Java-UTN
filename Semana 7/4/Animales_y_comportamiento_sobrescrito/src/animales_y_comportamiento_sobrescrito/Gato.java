
package animales_y_comportamiento_sobrescrito;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau, miauuuu!");
    }
    
    @Override
    public void describirAnimal() {
        System.out.println("Este es un gato llamado " + nombre);
    }
}
    
