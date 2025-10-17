
package ejercicio9;


public class Principal {
    public static void main(String[] args) {

        Paciente paciente = new Paciente ("Carolina Fusaro", "Osde");
        Profesional profesional = new Profesional("Pamela Jilbaja", "Psiquiatria");
        
      
        
        CitaMedica citaMedica = new CitaMedica("12-01-2025",1400, paciente, profesional);
        
        

        System.out.println(paciente);
        System.out.println(profesional);
        System.out.println(citaMedica);


    }
}
