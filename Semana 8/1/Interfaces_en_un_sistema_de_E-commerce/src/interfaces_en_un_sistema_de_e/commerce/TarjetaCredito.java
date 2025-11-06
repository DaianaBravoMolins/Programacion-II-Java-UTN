
package interfaces_en_un_sistema_de_e.commerce;

public class TarjetaCredito implements PagoConDescuento {
    private double descuento = 0;

    @Override
    public void aplicarDescuento(double porcentaje) {
        descuento = porcentaje;
    }

    @Override
    public void procesarPago(double monto) {
        double total = monto - (monto * descuento / 100);
        System.out.println("Pago con Tarjeta de Crédito procesado. Total: " + total);
    }
    
}
