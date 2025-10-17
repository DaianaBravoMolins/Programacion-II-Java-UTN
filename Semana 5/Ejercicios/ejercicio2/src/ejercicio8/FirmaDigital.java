package ejercicio8;

public class FirmaDigital {
    private int codigoHash;
    private String fecha;
    private String firma; 
    private Usuario usuario;
    
    public FirmaDigital(int codigoHash, String fecha, String firma, Usuario usuario){
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.firma = firma;
        this.usuario = usuario; 
    }
    
    public FirmaDigital (String firma){
        this.firma = firma;
    }
    
      public int getCodigoHash(){
        return codigoHash;
    }
      
    public String getFecha(){
        return fecha;
    }
    
    public String getFirma(){
        return firma;
    }

    public void getUsuario(){
        System.out.println("La firma digital " + codigoHash + " en la fecha: " + fecha + "contiene la firma de " + usuario.getNombre());
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + ", firma=" + firma 
                + (usuario != null ? ", Usuario: " + usuario : ", Usuario: (sin asignar)");
    }
    
    
}
