
package herencia.y.polimorfismo;

public class Auto extends Vehiculo{
    
    private int cantidadPuertas; //atributo adicional

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); // super llama al constructor de la clase base
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método de la clase base
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }
}
    


