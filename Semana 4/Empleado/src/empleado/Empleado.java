
package empleado;

public class Empleado {
      
        private static final double SALARIO = 850000; 
        //Atributos
        private int id;
        private String nombreCompleto;
        private String puesto;
        private double salario;
        private static int totalEmpleados = 0;
        
        //constructor que recibe todos los atributos como parametros
        public Empleado(int id, String nombreCompleto, String puesto, double salario) {
            this.id = id;
            this.nombreCompleto = nombreCompleto ;
            this.puesto = puesto;
            this.salario = salario;
            this.totalEmpleados ++;
        }
        
        //constructor que recibe determinados atributos como parametros
        public Empleado(String nombreCompleto, String puesto) {
            this.id = totalEmpleados + 1;
            this.nombreCompleto = nombreCompleto ;
            this.puesto = puesto;
            this.salario = SALARIO;
            this.totalEmpleados ++;
        }
        
        //salario actualizado con monto fijo
        public  void actualizarSalario(double sumaFija){
            this.salario += sumaFija;
        }
        
        //salario actualizado con porcentaje
        public void actualizarSalario(int porcentaje){
            this.salario += ((salario * porcentaje)/100);
        }
        
        //Metodo toString
        public String toString (){
            return "Empleado[id: " + id + ", nombreCompleto: " + nombreCompleto + ", puesto: " + puesto + ", salario: " + salario + ", totalEmpleados: " + totalEmpleados + "]";
      
        }
        
        //Metodo total de empleados
        public static int mostrarTotalEmpleados(){
            return totalEmpleados;
        }
        
        //Getters
         
        public int getId(){
            return id;
        }
        
        public String getNombreCompleto(){
            return nombreCompleto;
        }
         
        public String getPuesto(){
            return puesto;
        }
          
        public double getSalario(){
            return salario;
        }
           
        public int getTotalEmpleados(){
            return totalEmpleados;
        }
        
        //Setters
        
         
        public void setId(int nuevoId){
            id = nuevoId;
        }
        
        public void setNombreCompleto(String nuevoNombreCompleto){
            nombreCompleto = nuevoNombreCompleto;
        }
         
        public void setPuesto(String nuevoPuesto){
            puesto = nuevoPuesto;
        }
          
        public void setSalario(double nuevoSalario){
            salario = nuevoSalario;
        }
        
    }
    

