package ejercicios_tp2;
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        int nota;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");
        scanner.close();
    }
}
