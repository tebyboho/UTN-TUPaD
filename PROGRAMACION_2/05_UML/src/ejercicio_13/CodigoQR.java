package ejercicio_13;

public class CodigoQR {
    private String valor;
    private Usuario usuario; // Asociación unidireccional

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CodigoQR{" +
                "valor='" + valor + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
