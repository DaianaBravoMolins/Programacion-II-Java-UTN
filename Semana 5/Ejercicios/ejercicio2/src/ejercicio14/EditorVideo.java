
package ejercicio14;


public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        render.mostrarInfo();
    }
}

