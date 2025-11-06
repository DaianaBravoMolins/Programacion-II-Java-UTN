
package empleados_y_polimorfismo;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Ana", 50000));
        empleados.add(new EmpleadoTemporal("Alexis", 80, 500));
        empleados.add(new EmpleadoPlanta("María", 60000));
        empleados.add(new EmpleadoTemporal("Alejandro", 100, 400));

        // Invocamos calcularSueldo polimórficamente
        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.getNombre() + ", Sueldo: " + e.calcularSueldo());

            // Clasificación usando instanceof
            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }

            System.out.println("----");
        }
    }
    
}
