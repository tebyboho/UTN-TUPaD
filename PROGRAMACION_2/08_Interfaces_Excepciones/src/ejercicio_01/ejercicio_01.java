package ejercicio_01;

public class ejercicio_01 {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Juan Pérez");

        // Crear productos
        Producto prod1 = new Producto("Laptop", 1000.0);
        Producto prod2 = new Producto("Mouse", 50.0);

        // Crear pedido
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(prod1);
        pedido.agregarProducto(prod2);

        // Calcular total
        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        // Cambiar estado y notificar
        pedido.cambiarEstado("pagado");

        // Procesar pago con tarjeta
        TarjetaCredito tarjeta = new TarjetaCredito();
        tarjeta.aplicarDescuento(10.0);
        tarjeta.procesarPago(pedido.calcularTotal() - 10.0);

        // Procesar pago con PayPal
        PayPal paypal = new PayPal();
        paypal.aplicarDescuento(5.0);
        paypal.procesarPago(pedido.calcularTotal() - 5.0);
    }
}