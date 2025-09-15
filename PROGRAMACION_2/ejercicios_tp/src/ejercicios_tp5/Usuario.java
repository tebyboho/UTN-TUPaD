package ejercicios_tp5;

public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // asociación bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Celular getCelular() {
        return celular;
    }

    // package-private para controlar la bidireccionalidad desde Celular
    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Usuario[nombre=" + nombre + ", dni=" + dni + "]";
    }
}
