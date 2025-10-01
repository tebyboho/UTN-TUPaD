package ejercicio_2;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;


    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
            System.out.println("---");
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        return libros.removeIf(libro -> libro.getIsbn().equals(isbn));
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> filtrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                filtrados.add(libro);
            }
        }
        return filtrados;
    }

    public void mostrarAutoresDisponibles() {
        List<Autor> autores = new ArrayList<>();
        for (Libro libro : libros) {
            Autor autor = libro.getAutor();
            if (!autores.contains(autor)) {
                autores.add(autor);
            }
        }
        System.out.println("Autores disponibles:");
        for (Autor autor : autores) {
            autor.mostrarInfo();
            System.out.println("---");
        }
    }
}
