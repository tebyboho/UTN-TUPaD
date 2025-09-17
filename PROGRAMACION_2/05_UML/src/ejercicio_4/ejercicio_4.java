package ejercicio_4;

public class ejercicio_4 {
    
    public static void main (String [] args) {
        // Agregación : TarjetaDeCredito -> Banco
        Banco banco = new Banco("Banco Central", "30-12345678-9");

        // Asociación bidireccional : TarjetaDeCredito <-> Cliente
        Cliente cliente = new Cliente("Laura Martinez", "22334455");

        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4111111111111111", "2027-12", banco);
        tarjeta.setCliente(cliente);

        System.out.println(tarjeta);
        System.out.println("Cliente de la tarjeta: " + tarjeta.getCliente());
        System.out.println("Tarjeta del cliente: " + cliente.getTarjeta());
    }
}
