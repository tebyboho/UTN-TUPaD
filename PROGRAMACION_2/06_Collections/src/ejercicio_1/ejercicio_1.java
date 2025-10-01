package ejercicio_1;

import java.util.ArrayList;

public class ejercicio_1 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("001", "Manzanas", 0.5, 100, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("002", "Televisor", 1200.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("003", "Camiseta", 20.0, 50, CategoriaProducto.ROPA);
        Producto p4 = new Producto("004", "Sofá", 2900.0, 5, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("005", "Leche", 1.2, 200, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("Total stock: " + inventario.obtenerTotalStock());

        System.out.println("Productos en categoría ELECTRONICA:");
        for (Producto p : inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA)) {
            p.mostrarInfo();
        }

        // 1. Listar todos los productos mostrando su información y categoría.
        System.out.println("\n=== 1. Listar todos los productos ===");
        inventario.listarProductos();

        // 2. Buscar un producto por ID y mostrar su información.
        System.out.println("\n=== 2. Buscar producto por ID ===");
        Producto encontrado = inventario.buscarProductoPorId("003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        // 3. Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("\n=== 3. Filtrar productos por categoría ALIMENTOS ===");
        ArrayList<Producto> alimentos = inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        for (Producto p : alimentos) {
            p.mostrarInfo();
            System.out.println("---");
        }

        // 4. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("\n=== 4. Eliminar producto por ID y listar restantes ===");
        inventario.eliminarProducto("004");
        inventario.listarProductos();

        // 5. Actualizar el stock de un producto existente.
        System.out.println("\n=== 5. Actualizar stock de un producto ===");
        inventario.actualizarStock("005", 250);
        Producto leche = inventario.buscarProductoPorId("005");
        if (leche != null) {
            System.out.println("Stock actualizado de Leche: " + leche.getCantidad());
        }

        // 6. Mostrar el total de stock disponible.
        System.out.println("\n=== 6. Mostrar total de stock disponible ===");
        System.out.println("Total stock: " + inventario.obtenerTotalStock());

        // 7. Obtener y mostrar el producto con mayor stock.
        System.out.println("\n=== 7. Producto con mayor stock ===");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        // 8. Filtrar productos con precios entre $1000 y $3000.
        System.out.println("\n=== 8. Filtrar productos con precios entre 1000 y 3000 ===");
        ArrayList<Producto> precioFiltrado = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : precioFiltrado) {
            p.mostrarInfo();
            System.out.println("---");
        }

        // 9. Mostrar las categorías disponibles con sus descripciones.
        System.out.println("\n=== 9. Mostrar categorías disponibles con descripciones ===");
        System.out.println("Categorías disponibles:");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat + ": " + cat.getDescripcion());
        }
    }
}
