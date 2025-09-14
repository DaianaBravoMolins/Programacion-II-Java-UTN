package POO;

public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    void mostrarInfo(){
        System.out.println(nombre + " " + apellido + " " + curso + " " + calificacion);
    }
    
    double subirCalificacion(double puntos){
        return calificacion += puntos;
    }
            
    double bajarCalificacion(double puntos){
        return calificacion += puntos;
    }
}
