
package animales_y_comportamiento_sobrescrito;


public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }
    
    @Override
    public void describirAnimal() {
        System.out.println("Este es un perro llamado " + nombre);
    }
}
    
