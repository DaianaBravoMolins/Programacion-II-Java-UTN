
package ejercicio14;


public class Principal {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Documental", 45);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto);
    }

}
