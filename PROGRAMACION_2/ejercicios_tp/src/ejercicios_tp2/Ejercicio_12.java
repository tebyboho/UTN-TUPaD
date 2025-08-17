package ejercicios_tp2;

public class Ejercicio_12 {
     public static void main(String[] args) {
        double[] precios = {59.99, 280.5, 119.99, 1350.0, 28.99};

        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        precios[1] = 179.99;

        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
