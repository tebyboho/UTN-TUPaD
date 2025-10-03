package ejercicio_5;

public class ejercicio_5 {

    // metodo generico para procesar pago, con cualquier medio
    public static void procesarPago(Pagable medio){
        medio.pagar();
    }

    public static void main(String[] args){

        // creo distintos formas de pago
        Pagable tarjeta = new TarjetaCredito("1234-5678-9012-3546");
        Pagable transferencia = new Transferencia("Cuenta-ABC123");
        Pagable efectivo = new Efectivo(100.0);


        // procesamiento con una sola funcion, polimorfismo
        procesarPago(tarjeta);
        procesarPago(transferencia);
        procesarPago(efectivo);

    }
}
