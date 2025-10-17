
package ejercicio10;

public class ClaveSeguridad {
    
    private int codigo;
    private String ultimaModificacion;
    private String clave;
    
    public ClaveSeguridad(int codigo, String ultimaModificacion, String clave){
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
        this.clave = clave;
    }
    
    public String getClave(){
        return clave;
    }
    
    
    public int getCodigo(){
        return codigo;
    }
    
      
    public String ultimaModificacion(){
        return ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + '}';
    }
    
    
}
