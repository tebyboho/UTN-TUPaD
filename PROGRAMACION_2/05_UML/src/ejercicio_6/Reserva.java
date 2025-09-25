package ejercicio_6;

public class Reserva {
    private String fecha;
    private String hora;
    // asociación unidireccional: Reserva -> Cliente
    private Cliente cliente;
    // agregación: Reserva -> Mesa
    private Mesa mesa;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }
    
    // fix de relacion
    public void setMesa(Mesa mesa){
        this.mesa = mesa;
    }
    @Override
    public String toString() {
        return "Reserva[fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + ", mesa=" + mesa + "]";
    }
}
