
package animales_y_comportamiento_sobrescrito;

class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }

    public void describirAnimal() {
        System.out.println("Este es un animal llamado " + nombre);
    }
}