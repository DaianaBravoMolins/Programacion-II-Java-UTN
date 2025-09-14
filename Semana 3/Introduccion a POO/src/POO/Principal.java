package POO;
//Bravo Molins Daiana 
// Trabajo Practico 3 


public class Principal {
    public static void main(String[] args) {
        
        /*
        Registro de Estudiantes
        a. Crear una clase Estudiante con los atributos: nombre, apellido, curso,
        calificación.
        Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),
        bajarCalificacion(puntos).
        Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
        calificaciones.
        */
        
        Estudiante EstudianteA = new Estudiante ();
        EstudianteA.nombre = "Carlos";
        EstudianteA.apellido = "Garcia";
        EstudianteA.curso = "Informatica";
        EstudianteA.calificacion = 7.0;
        
        EstudianteA.mostrarInfo();
       
        System.out.println(EstudianteA.subirCalificacion(2.0));
        
        System.out.println(EstudianteA.bajarCalificacion(-4.0));
        
   
    
        /* Ejercicio 2
        Registro de Mascotas
        a. Crear una clase Mascota con los atributos: nombre, especie, edad.
        Métodos requeridos: mostrarInfo(), cumplirAnios().
        Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y
        verificar los cambios. */
        
        System.out.println("Ejercicio 2");
        
        Mascota mascotaz = new Mascota();
        
        mascotaz.nombre = "Pipa";
        mascotaz.especie = "Border Terrier";
        mascotaz.edad = 5;
        
        System.out.println("Nombre: " + mascotaz.nombre + " " + "\nEspecie: " + mascotaz.especie + " " + "\nEdad: "+ mascotaz.edad);
        //Simulacion de paso del tiempo:
        System.out.println("El tiempo transcurrido ha sido de " + mascotaz.tiempoTranscurrido(2028) + " años.");
       
        System.out.println("Los datos actuales de la mascota son: ");
        //Actualizacion de datos: nombre y edad.
        int tiempoTranscurrido = mascotaz.tiempoTranscurrido(2028);
      
        mascotaz.edad = mascotaz.edad + tiempoTranscurrido; 
        
        mascotaz.mostrarInfo("Rufus", mascotaz.edad);
        
        /*Encapsulamiento con la Clase Libro
        a. Crear una clase Libro con atributos privados: titulo, autor,
        añoPublicacion.
        Métodos requeridos: Getters para todos los atributos. Setter con validación
        para añoPublicacion.
        Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con
        uno válido, mostrar la información final.
        */
        System.out.println("Ejercicio 3.");
        
        Libro a = new Libro();
        
        a.getTitulo();
        a.getAutor();
        a.getAñoPublicacion();
                
        a.setTitulo("1984");
        System.out.println("Titulo: " + a.getTitulo());
        
        a.setAutor("George Orwell");
        System.out.println("Autor: " + a.getAutor());
        
        
        a.setAñoPublicacion(1906);
        System.out.println("Fecha de publicacion: " + a.getAñoPublicacion());
        
        //Anotando una fecha invalida:
        a.setAñoPublicacion(1900);
        System.out.println("Año publicacion: " + a.getAñoPublicacion());

        //Anotando una fecha valida:
        a.setAñoPublicacion(1940);
        System.out.println("Año publicacion: " + a.getAñoPublicacion());

        /*
        4. Gestión de Gallinas en Granja Digital
        a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
        Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
        Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.
        */
        System.out.println("Ejercicio 4");
        
        Gallinas A = new Gallinas ();
        
        A.getidGallina();
        A.getedad();
        A.gethuevosPuestos();
        
        System.out.println("Gallina A");
        A.setidGallina("001");
        System.out.println("El id de la gallina es: " + A.getidGallina());
        
        A.setedad(3);
        System.out.println("La edad de la gallina es de: " + A.getedad());

        A.sethuevosPuestos(12);
        System.out.println("La cantidad de huevos puestos es de: " + A.gethuevosPuestos());
        
        //Otra gallina
        System.out.println("Gallina B");
        Gallinas B = new Gallinas ();
        
        B.getidGallina();
        B.getedad();
        B.gethuevosPuestos();
        
        B.setidGallina("002");
        System.out.println("El id de la gallina es: " + B.getidGallina());
        
        B.setedad(5);
        System.out.println("La edad de la gallina es de: " + B.getedad());

        B.sethuevosPuestos(29);
        System.out.println("La cantidad de huevos puestos es de: " + B.gethuevosPuestos());
//Metodos
        
        A.PonerHuevo(6);
        A.envejecer(10);
        
        B.PonerHuevo(21);
        B.envejecer(10);

        A.mostrarEstado();
        B.mostrarEstado();
        
    /*5. Simulación de Nave Espacial
    Crear una clase NaveEspacial con los atributos: nombre, combustible.
    Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
    Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
    Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar 
    correctamente. Mostrar el estado al final.
    */
    
    System.out.println("Ejercicio 5");
    
    NaveEspacial Alfa = new NaveEspacial();
    
    Alfa.setnombre("Alfa");
    //System.out.println("El nombre de la nave espacial es: " + Alfa.getnombre());
    
    Alfa.setcombustible(50);
    System.out.println("La cantidad inicial de combustible que tiene la nave es de: " + Alfa.getcombustible() + " litros.");
    
    
    Alfa.despegar(0);
    
    Alfa.avanzar(2);
    
    Alfa.recargarCombustible(30);

    Alfa.avanzar(2);
    
    Alfa.mostrarEstado();
    
    
    }
}
