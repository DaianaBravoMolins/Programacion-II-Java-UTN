
package ejercicio9;


public class CitaMedica {
    
    private String fecha;
    private int hora;
    private Paciente paciente;
    private Profesional profesional;
    
    public CitaMedica(String fecha, int hora){
        this.fecha = fecha;
        this.hora = hora;
    }
    
    
    public CitaMedica(String fecha, int hora, Paciente paciente, Profesional profesional){
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public int getHora(){
        return hora;
    }
    
    public void mostrarPaciente(){
        if (paciente != null){
            System.out.println("El paciente "+ paciente.getNombre() + "tiene " + paciente.getObraSocial() + " de obra social.");
        }
        else{
            System.out.println("El paciente no tiene obra social");
        }
    }
    
    
    public void mostrarProfesional(){
        if (profesional != null){
            System.out.println("El profesional" + profesional.getNombre() + "tiene como especialidad: " + profesional.getEspecialidad());
        }
        else{
            System.out.println("El profesional no atiende.");
        }
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + '}';
    }
    
    
}
