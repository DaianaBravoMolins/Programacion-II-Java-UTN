package POO;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private int distancia; // Se agrega atributo extra a fin de mostrar un poco mas de informacion.

    //setters
    public String getnombre(){
       return nombre;
    }
    
    public int getcombustible(){
     return combustible;
    }
    
    public int distancia(){
        return distancia;
    }
    
    //getters
    
    public void setnombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
     
    public void setcombustible(int nuevoCombustible){
        combustible = nuevoCombustible;
    }
     
    //Metodos:
     
    public void despegar(int distancia){
        if (distancia != 0) {
            System.out.println("Error, reintente, no se puede avanzar millas al despegar. El valor de la distancia debe ser cero.");
        }
        else{
            System.out.println("Nave despegando en 1, 2, 3 !!!");
        }
    } 
    
    public void avanzar(int nuevaDistancia){
        if (combustible < 80) {
            System.out.println("Cantidad insuficiente de combustible. Por favor haga una recarga para poder avanzar.");
        } 
        else{
            distancia += nuevaDistancia;
        }
    }

    public void recargarCombustible(int cantidadCombustible){

    combustible += cantidadCombustible;
    System.out.println("Usted ha recargado la nave con " + cantidadCombustible + " litros." + "\nAhora el combustible es de " + combustible + " litros.");
    
    } 
    
    public void mostrarEstado(){
        System.out.println("Estado de la nave");
        System.out.println("El nombre de la nave: " + nombre);
        System.out.println("Cantidad de combustible: " + combustible);
        System.out.println("Ha avanzado: " + distancia + " milla/s.");
    }   
}
