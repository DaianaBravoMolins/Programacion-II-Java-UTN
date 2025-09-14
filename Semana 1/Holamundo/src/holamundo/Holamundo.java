
package holamundo;

import java.util.Scanner;


public class Holamundo {

    public static void main(String[] args) {
        
        //Ejercicio 2:
        System.out.println("¡Hola, Java!");
        
        //Ejercicio 3:
        String nombre = "Lucia";
        int edad = 45;
        double altura = 1.65;
        boolean estudiante = true;
        
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(altura);
        System.out.println(estudiante);
        
        /* Ejercicio 4: 
        Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego
        los muestre en pantalla. Usa Scanner para capturar los datos.*/
        
        Scanner input = new Scanner(System.in);
        String nombreIngresado;
        int edadIngresada;
        
        System.out.println("Ingrese su nombre");
        nombreIngresado = input.nextLine();
        System.out.println("Ingrese su edad");
        edadIngresada = input.nextInt();
        
        System.out.println(nombreIngresado);
        System.out.println(edadIngresada);

        /*Ejercicio 5: 
        Escribe un programa que solicite dos números enteros y realice las siguientes
        operaciones:
        a. Suma
        b. Resta
        c. Multiplicación
        d. División
        Muestra los resultados en la consola.*/ 
        
        int primerNumeroIngresado;
        int segundoNumeroIngresado;
        System.out.println("Ingrese un primer numero");
        primerNumeroIngresado = input.nextInt();
        System.out.println("Ingrese un segundo numero");
        segundoNumeroIngresado = input.nextInt();

        System.out.println(primerNumeroIngresado + segundoNumeroIngresado);
        System.out.println(primerNumeroIngresado - segundoNumeroIngresado);
        System.out.println(primerNumeroIngresado * segundoNumeroIngresado);
        System.out.println(primerNumeroIngresado / segundoNumeroIngresado);

        /*Ejercicio 6:
        Escribe un programa que muestre el siguiente mensaje en consola:
        Nombre: Juan Pérez
        Edad: 30 años
        Dirección: "Calle Falsa 123"
        Usa caracteres de escape (\n, \") en System.out.println()
        */
        
        System.out.println("Nombre: Juan Perez\nEdad: 30 años\nDireccion: \"Calle Falsa 123\"");
        
        /*Ejercicio 7:
        Analiza el siguiente código y responde: ¿Cuáles son expresiones y cuáles son
        instrucciones? Explica la diferencia en un breve párrafo.
        int x = 10; // Línea 1
        x = x + 5; // Línea 2
        System.out.println(x); // Línea 3
        */
        
        /*Una expresión es algo que produce un valor. Puede ser un número, una operación matemática 
        o una llamada a un método que devuelve algo.
        Una instrucción es una acción completa que Java ejecuta.Puede incluir expresiones dentro, pero 
        su propósito es hacer algo: asignar, imprimir, llamar un método, etc.
        Entonces en este ejerciicos las 3 lineas son instrucciones: 
        - Linea 1 hay una declaracion y asignacion. 
        - Linea 2 hay una asignacion que modifica el valor de x.
        - Linea 3 hay una instruccion que pide la impresion por consola.
        */
        
        /*Ejercicio 8:
        Manejar conversiones de tipo y división en Java.
        a. Escribe un programa que divida dos números enteros ingresados por el
        usuario.
        b. Modifica el código para usar double en lugar de int y compara los
        resultados.
        */
       
       /*Usando int :*/
       int primerNumeroIngresadoParaDivision ;
       int segundoNumeroIngresadoParaDivision;
       
       System.out.println("Ingrese un numero: ");
       primerNumeroIngresadoParaDivision = input.nextInt();
       System.out.println("Ahora ingrese un segundo numero: ");
       segundoNumeroIngresadoParaDivision = input.nextInt();

     
       System.out.println("Resultado de la division: " + primerNumeroIngresadoParaDivision / segundoNumeroIngresadoParaDivision);
       /*Usando Double :*/
        
       double primerNumeroIngresadoParaDivisionDouble ;
       double segundoNumeroIngresadoParaDivisionDouble;
       
       System.out.println("Ingrese un numero: ");
       primerNumeroIngresadoParaDivisionDouble = input.nextInt();
       System.out.println("Ahora ingrese un segundo numero: ");
       segundoNumeroIngresadoParaDivisionDouble = input.nextInt();

       System.out.println("Resultado de la division: " + primerNumeroIngresadoParaDivisionDouble / segundoNumeroIngresadoParaDivisionDouble);
        
       /*Al utilizar el double el resultado de la division nos muestra el resultado con un decimal (Ej: 20/2 = 10.0)*/ 
        
       /*Ejercicio 9:
       Corrige el siguiente código para que funcione correctamente. Explica qué error
       tenía y cómo lo solucionaste.
       import java.util.Scanner;
       public class ErrorEjemplo {
       public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Ingresa tu nombre: ");
       String nombre = scanner.nextInt(); // ERROR
       System.out.println("Hola, " + nombre);
       }*/
 
       Scanner scanner = new Scanner(System.in);
       System.out.print("Ingresa tu nombre: ");
       String nombreEjercicio9 = scanner.nextLine(); // Error Corregido
       System.out.println("Hola, " + nombreEjercicio9);
       /*El error de este ejercicio era que tomaba el ingreso como un numero entero, mientras que ese ingreso
       en realidad ya estaba declarado previamaente como ingreso en formato de string. Entonces eran incompatibles 
       porque se trata de dos tipos de datos diferentes. Por eso cambie por "nextLine()". De esta manera el ingreso
       del dato nombre, al ser completado por el usuario, el programa lo lee como lo que es, un string. */
      
       
       /* Completa la tabla de prueba de escritorio para el siguiente código. ¿Cuál es el
       valor de resultado y por qué?
       
       public class PruebaEscritorio {
       public static void main(String[] args) {
       int a = 5;
       int b = 2;
       int resultado = a / b;
       System.out.println("Resultado: " + resultado);
       }
       */
       
       /*
       Linea    a                       b               division
       148    sin definir           sin definir         sin definir
       149    sin definir           sin definir         sin definir
       150      5                   sin definir         sin definir
       151      5                       2               sin definir
       152      5                       2                   2
       153      5                       2                   2
       154      5                       2                   2
       
       El resultado de la division es 2, porque se esta usando el tipo de dato int que toma enteros 
       y el operador aritmetico "/" que muestra resultados enteros, no con decimales.
       */
    }
    
}
