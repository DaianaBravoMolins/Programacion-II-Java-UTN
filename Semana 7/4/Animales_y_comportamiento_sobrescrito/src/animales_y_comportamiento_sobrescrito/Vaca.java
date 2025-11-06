
package animales_y_comportamiento_sobrescrito;

public class Vaca extends Animal {
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Muuuuuuuuuuuuuuuuuu!");
    }
    
    @Override
    public void describirAnimal() {
        System.out.println("Esta es una vaca llamado " + nombre);
    }
}
