
package empleado;
// Bravo Molins Daiana Mariel
// Trabajo Practico nº 4

public class Principal {
    
    public static void main(String[] args) {
        /*
        Sistema de Gestión de Empleados
        Modelar una clase Empleado que represente a un trabajador en una empresa.
        Esta clase debe incluir constructores sobrecargados, métodos sobrecargados y el uso
        de atributos aplicando encapsulamiento y métodos estáticos para llevar control de los
        objetos creados.
        CLASE EMPLEADO
        Atributos:
        ● int id: Identificador único del empleado.
        ● String nombre: Nombre completo.
        ● String puesto: Cargo que desempeña.
        ● double salario: Salario actual.
        ● static int totalEmpleados: Contador global de empleados creados.
        REQUERIMIENTOS
        1. Uso de this:
        ○ Utilizar this en los constructores para distinguir parámetros de
        atributos.
        2. Constructores sobrecargados:
        ○ Uno que reciba todos los atributos como parámetros.
        ○ Otro que reciba solo nombre y puesto, asignando un id
        automático y un salario por defecto.
        ○ Ambos deben incrementar totalEmpleados.
        3. Métodos sobrecargados actualizarSalario:
        ○ Uno que reciba un porcentaje de aumento.
        ○ Otro que reciba una cantidad fija a aumentar.
        4. Método toString():
        ○ Mostrar id, nombre, puesto y salario de forma legible.
        5. Método estático mostrarTotalEmpleados():
        ○ Retornar el total de empleados creados hasta el momento.
        6. Encapsulamiento en los atributos:
        ○ Restringir el acceso directo a los atributos de la clase.
        ○ Crear los métodos Getters y Setters correspondientes.
        TAREAS A REALIZAR
        1. Implementar la clase Empleado aplicando todos los puntos anteriores.
        2. Crear una clase de prueba con método main que:
        ○ Instancie varios objetos usando ambos constructores.
        ○ Aplique los métodos actualizarSalario() sobre distintos
        empleados.
        ○ Imprima la información de cada empleado con toString().
        ○ Muestre el total de empleados creados con
        mostrarTotalEmpleados().*/
        
        Empleado empleado01 = new Empleado(24, "Carlos Fabian Gomez", "Back-End", 900000);
        Empleado empleado02 = new Empleado(25, "Daiana Mariel Bravo", "Front-End", 800000);
        Empleado empleado03 = new Empleado("Carolina Fusaro Casellas", "Mantenimiento");
        Empleado empleado04 = new Empleado("Maximiliano Rodrigo Benitez", "PM");
        Empleado empleado05 = new Empleado("Sonia Mara Fontana", "Tester");

        System.out.println("Informacion de empleados: ");

        System.out.println(empleado01);
        System.out.println(empleado02);
        System.out.println(empleado03);
        System.out.println(empleado04);
        System.out.println(empleado05);
        
        System.out.println("Actualizaciones de algunos salarios: ");
        empleado01.actualizarSalario(60000.00);
        System.out.println(empleado01);
        
        empleado03.actualizarSalario(10);
        System.out.println(empleado03);
        
        empleado05.actualizarSalario(20);
        System.out.println(empleado05);
        
        System.out.println("Utilizacion de setters y getters");  
        System.out.println("Id: " + empleado03.getId());
        System.out.println("Nombre: " + empleado03.getNombreCompleto());
        
        empleado03.setNombreCompleto("Carolina Alejandra Fusaro Casellas");
        System.out.println("Actualizamos el nombre completo");
        System.out.println(empleado03.getNombreCompleto());
        
        
        System.out.println("Actualizamos el Id de otro empleado:");
        System.out.println("El id es: " + empleado05.getId());
        System.out.println("Su nombre: " + empleado05.getNombreCompleto());

        System.out.println("Actualizamos el id");
        empleado05.setId(2);
        System.out.println("El nuevo id actulizado es: " + empleado05.getId());
        
        
        System.out.println("Informacion de cada empleado con toString:");
        System.out.println(empleado01.toString());
        System.out.println(empleado02.toString());
        System.out.println(empleado03.toString());
        System.out.println(empleado04.toString());
        System.out.println(empleado05.toString());
        
        System.out.println("Utilizacion del metodo mostrarTotalEmpleados:");
        System.out.println("La cantidad de empleados es de: " + Empleado.mostrarTotalEmpleados());

}
}