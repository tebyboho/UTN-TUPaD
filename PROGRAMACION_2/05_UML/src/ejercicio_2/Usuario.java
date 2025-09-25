
package ejercicio_2;


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

    // bidireccionalidad desde Celular, correccion.. se establece aca tambien la bidireccionalidad para evitar bucle
    public void setCelular(Celular celular) {
        this.celular = celular;
        if(celular != null && celular.getUsuario() != this){
            celular.setUsuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario[nombre=" + nombre + ", dni=" + dni + "]";
    }
}