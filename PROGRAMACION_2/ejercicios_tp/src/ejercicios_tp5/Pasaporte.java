package ejercicios_tp5;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    // composición: Foto forma parte del Pasaporte
    private Foto foto;
    // asociación bidireccional con Titular
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    // establece la asociación y mantiene la bidireccionalidad
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    @Override
    public String toString() {
        return "Pasaporte[numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + "]";
    }
}
