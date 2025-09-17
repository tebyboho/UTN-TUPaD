package ejercicios_tp2;
import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        if (precioProducto <= 0) {
            System.out.println("El precio del producto no puede ser negativo");
            return;
        }

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();

        if (peso <= 0) {
            System.out.println("El peso del producto no puede ser negativo");
            return;
        }

        scanner.nextLine();
        System.out.print("Ingrese la zona de envío (N para Nacional o I para Internacional): ");
        String zona = scanner.nextLine();

        if (!zona.equalsIgnoreCase("N") && !zona.equalsIgnoreCase("I")) {
            System.out.println("La zona de envío ingresada no es válida");
            return;
        }

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);


        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("N")) {
            return peso * 5;
        }
        if (zona.equalsIgnoreCase("I")) {
            return peso * 10;
        }
        return 0;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
