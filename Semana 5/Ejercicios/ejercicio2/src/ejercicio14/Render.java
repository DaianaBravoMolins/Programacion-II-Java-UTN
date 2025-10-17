
package ejercicio14;


public class Render {
    private String formato;
    private Proyecto proyecto;
    
    public Render(String formato, Proyecto proyecto){
        this.formato = formato;
        this.proyecto = proyecto;
   
    }
    
    public String getFormato(){
        return formato;
    }
     public void mostrarInfo() {
        System.out.println("Renderizando proyecto '" + proyecto.getNombre() +
                           "' en formato " + formato +
                           " (duración: " + proyecto.getDuracioMin() + " min)");
    }
}
