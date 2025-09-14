package POO;

import java.util.Scanner;
    

public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    
    final static int ANIO_BASE = 2025; 
    
    int tiempoTranscurrido(int anio_actual){ 
        int tiempoTranscurrido = anio_actual - ANIO_BASE;
        return tiempoTranscurrido; 
    }   
    
    void mostrarInfo(String nuevoNombre, int nuevaEdad){
        System.out.println("Nombre: " + nuevoNombre +  " " + "Especie: " + especie + "Edad: " + nuevaEdad);   
    }
    
}