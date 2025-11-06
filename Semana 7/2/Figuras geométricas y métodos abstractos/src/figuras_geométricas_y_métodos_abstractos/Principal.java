
package figuras_geométricas_y_métodos_abstractos;

public class Principal {

    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        
        figuras[0] = new Circulo("Círculo Pequeño", 3);
        figuras[1] = new Rectangulo("Rectángulo Grande", 5, 8);
        figuras[2] = new Circulo("Círculo Grande", 7);

        // Mostrar área de cada figura
        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " Área: " + f.calcularArea());
        } 
        
    }
}
