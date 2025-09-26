
package ejercicio5;

public class PlacaMadre {
    
    private String modelo;
    private String chipset;
    private String detallePlacaMadre;
    
    public PlacaMadre(String modelo, String chipset, String detallePlacaMadre){
        this.modelo = modelo;
        this.chipset = chipset;
        this.detallePlacaMadre = detallePlacaMadre;
    }
    
    public PlacaMadre(String detallePlacaMadre){        //sobrecarga de constructor para usar solo detallePlacaMadre
        this.detallePlacaMadre = detallePlacaMadre;
    }
    public String getModelo(){
        return modelo;
    }
    
      public String getChipset(){
        return chipset;
    }
    
    
    public String getDetallePlacaMadre(){
        return detallePlacaMadre;
    }

    @Override
    public String toString() {
        return "PlacaMadre{" + "modelo=" + modelo + ", chipset=" + chipset + ", detallePlacaMadre=" + detallePlacaMadre + '}';
    }
    
    
}
