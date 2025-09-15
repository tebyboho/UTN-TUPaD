package ejercicios_tp5;

public class Usuario_{
    private String nombre;
    private String email;

    public Usuario_(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Usuario[nombre=" + nombre + ", email=" + email + "]";
    }
}
