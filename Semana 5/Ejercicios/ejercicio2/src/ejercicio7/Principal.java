
package ejercicio7;


public class Principal {
      public static void main(String[] args) {
          
        Conductor conductor = new Conductor("Vanesa Nesterovich", "L-12345");
        Motor motor = new Motor(250, 498422312);
        Vehiculo vehiculo = new Vehiculo("ABC-492", "Falcon X5", motor);

        vehiculo.setConductor(conductor);
        
        System.out.println(conductor); 
        System.out.println(motor); 
        System.out.println(vehiculo); 
      
      }
}
