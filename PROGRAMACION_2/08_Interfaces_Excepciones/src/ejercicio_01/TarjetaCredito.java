package ejercicio_01;

public class TarjetaCredito implements PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito: $" + monto);
    }

    @Override
    public void aplicarDescuento(double descuento) {
        System.out.println("Aplicando descuento de $" + descuento + " en tarjeta de crédito");
    }
}