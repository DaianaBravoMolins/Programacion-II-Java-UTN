package POO;

public class Gallinas {
    //Atributos
    private String idGallina;
    private int edad;
    private int huevosPuestos;
    
    //getters
    public String getidGallina(){
        return idGallina;
    }
    
    public int getedad(){
        return edad;
    }
    
    public int gethuevosPuestos(){
        return huevosPuestos;
    }
    
    //seeters
    public void sethuevosPuestos(int cantHuevos){
        huevosPuestos = cantHuevos;
    }
    
    
    public void setidGallina(String idNuevoGallina){
        idGallina = idNuevoGallina;
        //System.out.println("El nuevo id de la gallina es de: " + idGallina);
    }
    
    public void setedad(int nuevaEdadGallina){
        edad = nuevaEdadGallina;
        //System.out.println("La edad actual de la gallina es de: " + edad);
    }
 
    //Metodos:
    //PonerHuevo
    public void PonerHuevo(int nuevaCantidad){
        huevosPuestos += nuevaCantidad;
    }
    
    public void envejecer(int nuevaEdad){
        edad += nuevaEdad;
    }
    
    public void mostrarEstado(){
        System.out.println("Estado actual de la gallina " + idGallina);
        System.out.println("La edad de la gallina es: " + edad);
        System.out.println("Cantidad de huevos puestos: " + huevosPuestos);
       

    }
}
