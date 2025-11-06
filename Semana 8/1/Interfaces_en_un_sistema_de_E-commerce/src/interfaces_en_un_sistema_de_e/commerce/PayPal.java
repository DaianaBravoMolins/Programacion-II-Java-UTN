
package interfaces_en_un_sistema_de_e.commerce;

public class PayPal implements Pago{
    
       @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal procesado. Total: " + monto);
    }
}

