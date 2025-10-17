
package ejercicio7;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Conductor conductor;
    private Motor motor;

    public Vehiculo(String patente, String modelo, Motor motor){
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor; 
    }
    
    public void setConductor(Conductor conductor){
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo()!= this){
            conductor.setVehiculo(this);
        }
    }
    
    public void mostrarMotor(){
        System.out.println("El vehiculo" + modelo + " tiene un motor tipo " + motor.getTipo());
    }
    
    
    public String getPatente(){
        return patente;
    }
    
    public String getModelo(){
      return modelo;
    }
    
    public Conductor getConductor(){
        return conductor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", conductor=" + (conductor != null ? conductor.getNombre() : "ninguno"); 
    }
    
    
    
    }
