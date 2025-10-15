package ejercicio_06;

import java.io.*;
import java.util.Scanner;

public class ejercicio_06 {
    public static void main(String[] args) {
        // Ejercicio 2.5: Uso de try-with-resources
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el nombre del archivo: ");
            String nombreArchivo = sc.nextLine();
            
            try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
                String linea;
                System.out.println("Contenido del archivo:");
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa.");
        }
    }
}
