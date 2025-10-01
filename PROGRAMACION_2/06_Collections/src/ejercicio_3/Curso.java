package ejercicio_3;


public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;


    public Curso(String codigo, String nombre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public String getCodigo() {
        return codigo;
    }

 
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        if (profesor != null) {
            profesor.eliminarCurso(this);
        }
        profesor = p;
        if (p != null) {
            p.agregarCurso(this);
        }
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", profesor=" + profesor +
                '}';
    }

    public void mostrarInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: No asignado");
        }
    }
}