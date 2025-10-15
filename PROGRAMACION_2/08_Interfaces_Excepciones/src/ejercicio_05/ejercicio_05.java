package ejercicio_05;

import java.util.Scanner;

// Excepción personalizada
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class ejercicio_05 {
    public static void main(String[] args) {
        // Ejercicio 2.4: Excepción personalizada
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();
            
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad inválida: debe estar entre 0 y 120 años.");
            }
            
            System.out.println("Edad válida: " + edad + " años.");
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa.");
        }
    }
}
