
package interfaces_en_un_sistema_de_e.commerce;

public class Principal {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana");

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Libro", 500));
        pedido.agregarProducto(new Producto("Auriculares", 1500));

        System.out.println("Total del pedido: " + pedido.calcularTotal());

        TarjetaCredito tarjeta = new TarjetaCredito();
        tarjeta.aplicarDescuento(10);
        tarjeta.procesarPago(pedido.calcularTotal());

        pedido.setEstado("Enviado");
    }
}
        