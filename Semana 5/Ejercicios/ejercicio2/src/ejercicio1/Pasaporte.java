
package ejercicio1;


public class Pasaporte {
     
        private int numero;
        private String fechaEmision;
        private Titular titular; //referencia al titular asociado
        private Foto foto; //composicion 1:1
        
        public Pasaporte(int numero, String fechaEmision, String imagen, String formato, Titular titular){
            this.numero = numero;
            this.fechaEmision = fechaEmision;
            this.foto = new Foto (imagen, formato);
            this.titular = titular;
            if (titular != null){
                titular.setPasaporte(this);
            }
        }
        
        public void setTitular(Titular titular){
            this.titular = titular;
            if(titular != null && titular.getPasaporte() != this){
                titular.setPasaporte(this);
            }
        }
        
        public void mostrarImagen(){
            System.out.println("Pasaporte: " + "tiene foto: " + foto.getImagen());
        }
        public int getNumero(){
            return numero;
        }
        
         public String getfechaEmision(){
            return fechaEmision;
        }
        
         public Titular getTitular(){
            return titular;
        }
         
        
        public Foto getFoto() {
            return foto;
        } 

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", titular=" + titular + ", foto=" + foto + '}';
    }
         
        
}
    
    
   
