package ejercicio_01;

public class PayPal implements PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal: $" + monto);
    }

    @Override
    public void aplicarDescuento(double descuento) {
        System.out.println("Aplicando descuento de $" + descuento + " en PayPal");
    }
}