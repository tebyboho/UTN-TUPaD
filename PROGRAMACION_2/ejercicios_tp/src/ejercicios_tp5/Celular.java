package ejercicios_tp5;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    // agregación: Celular tiene una Bateria (pero la batería puede existir independientemente)
    private Bateria bateria;
    // asociación bidireccional con Usuario
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    // establecer usuario y mantener la bidireccionalidad
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    @Override
    public String toString() {
        return "Celular[imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + "]";
    }
}
