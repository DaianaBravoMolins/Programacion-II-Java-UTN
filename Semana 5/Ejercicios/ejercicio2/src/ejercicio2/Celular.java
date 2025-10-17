
package ejercicio2;


public class Celular {
    private int imei;
    private String marca;
    private String modelo;
    private Bateria bateria; //Agregacion 1:1
    private Usuario usuario;
    
    public Celular(int imei, String marca, String modelo, Bateria bateria, Usuario usuario){
        this.imei = imei; 
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        setUsuario(usuario);
    }

    public void mostrarBateria(){
        System.out.println("El celular marca: " + marca + "y modelo: " + modelo + "tiene una bateria tipo: " + bateria.getModelo() + "y su usuario es " + usuario);
        
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario; 
        if (usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
    }
    
    public int getImei(){
        return imei;
    }
    
     public String getMarca(){
        return marca;
    }
    
     public String getModelo(){
        return modelo;
    }
    
     public Usuario getUsuario(){
        return usuario;
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", usuario=" + usuario + '}';
    }
    
     
    
    
    
    
    
    
    
    
    
    
    
}
