package ejercicio_03;

import java.util.Scanner;

public class ejercicio_03 {
    public static void main(String[] args) {
        // Ejercicio 2.2: Conversión de cadena a número
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            String texto = sc.nextLine();
            
            try {
                int numero = Integer.parseInt(texto);
                System.out.println("Número convertido: " + numero);
            } catch (NumberFormatException e) {
                System.out.println("Error: El texto no es un número válido.");
            }
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa.");
        }
    }
}
