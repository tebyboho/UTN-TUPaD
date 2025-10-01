package ejercicio_2;


public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;


    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

 
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNacionalidad() {
        return nacionalidad;
    }

 
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    @Override
    public String toString() {
        return "Autor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
    
    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nacionalidad: " + nacionalidad);
    }
}