
package ejercicio8;


public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    
    public Documento(String titulo, String contenido, int codigoHash, String fecha, String firma, Usuario usuario){
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, firma, usuario);
    }

    public void getFirmaDigital(){
            System.out.println("Documento: " + titulo + " ,tiene la firma: " + firmaDigital.getFirma());
    }

    
    public String getTitulo(){
        return titulo;
    }

    public String getContenido(){
        return contenido;
    }

    
    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firmaDigital=" + firmaDigital + '}';
    }


}

