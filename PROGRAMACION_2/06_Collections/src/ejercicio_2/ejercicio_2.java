
package ejercicio_2;

public class ejercicio_2 {
    public static void main(String[] args) {
        // 1. Creamos una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear al menos tres autores
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A002", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A003", "Mario Vargas Llosa", "Peruano");

        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("ISBN003", "La casa de los espíritus", 1982, autor2);
        biblioteca.agregarLibro("ISBN004", "Eva Luna", 1987, autor2);
        biblioteca.agregarLibro("ISBN005", "La ciudad y los perros", 1963, autor3);

        // 4. Listar todos los libros con su información y la del autor
        System.out.println("=== Lista de todos los libros ===");
        biblioteca.listarLibros();

        // 5. Buscar un libro por su ISBN y mostrar su información
        System.out.println("=== Búsqueda de libro por ISBN ===");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        // 6. Filtrar y mostrar los libros publicados en un año específico
        System.out.println("=== Libros publicados en 1985 ===");
        biblioteca.filtrarLibrosPorAnio(1985).forEach(Libro::mostrarInfo);

        // 7. Eliminar un libro por su ISBN y listar los libros restantes
        System.out.println("=== Eliminando libro con ISBN ISBN005 ===");
        boolean eliminado = biblioteca.eliminarLibro("ISBN005");
        System.out.println("Libro eliminado: " + eliminado);
        System.out.println("=== Libros restantes ===");
        biblioteca.listarLibros();

        // 8. Mostrar la cantidad total de libros en la biblioteca
        System.out.println("=== Cantidad total de libros ===");
        System.out.println("Total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar todos los autores de los libros disponibles en la biblioteca
        System.out.println("=== Autores disponibles ===");
        biblioteca.mostrarAutoresDisponibles();
    }
}
