package ejercicio_1;

import java.util.ArrayList;
import java.util.HashSet;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            return true;
        }
        return false;
    }

    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // Método que encuentra el producto con la mayor cantidad en stock.
    // Si hay varios con la misma cantidad máxima, devuelve el primero encontrado.
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto mayor = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayor.getCantidad()) {
                mayor = p;
            }
        }
        return mayor;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    // Método que muestra en consola las categorías únicas disponibles en el inventario.
    // Utiliza un HashSet para evitar duplicados.
    public void mostrarCategoriasDisponibles() {
        HashSet<CategoriaProducto> categorias = new HashSet<>();
        for (Producto p : productos) {
            categorias.add(p.getCategoria());
        }
        System.out.println("Categorías disponibles:");
        for (CategoriaProducto cat : categorias) {
            System.out.println(cat);
        }
    }

    public void listarProductos() {
        System.out.println("Lista de productos:");
        for (Producto p : productos) {
            p.mostrarInfo();
            System.out.println("---");
        }
    }
}