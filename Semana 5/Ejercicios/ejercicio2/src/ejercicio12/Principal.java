
package ejercicio12;


public class Principal {
    
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora(5 + 33);

        Contribuyente contribuyente = new Contribuyente("L aura Pérez", "27-33456789-9");
        Impuesto impuesto = new Impuesto(125000, contribuyente);

        calculadora.calcular(impuesto);
    }
}
