package ejercicio_5;


// clase que implementa Pagable
public class TarjetaCredito implements Pagable{
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }


    // implementacion del pago
    @Override
    public void pagar(){
        System.out.println("Pagando con tarjetra de credito: " + numeroTarjeta);
    }

}
