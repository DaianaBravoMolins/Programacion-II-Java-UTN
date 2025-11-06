package figuras_geométricas_y_métodos_abstractos;

abstract class Figura{
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto para que implementar las subclases
    public abstract double calcularArea();

    public String getNombre() {
        return nombre;
    }
}
