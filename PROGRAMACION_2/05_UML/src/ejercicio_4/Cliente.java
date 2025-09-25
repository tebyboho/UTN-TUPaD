package ejercicio_4;

public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // asociación bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    // correccion, aca se establece la bidireccionalidad tambien para evitar bucles
    void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente() != this){
            tarjeta.setCliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente[nombre=" + nombre + ", dni=" + dni + "]";
    }
}
