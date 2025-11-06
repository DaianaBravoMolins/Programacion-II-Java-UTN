
package empleados_y_polimorfismo;

abstract public class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto para que implementar las subclases
    public abstract double calcularSueldo();
}
    

