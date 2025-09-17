
package ejercicios_tp2;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args){
        int numero;
        int sumaPares = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                sumaPares += numero;
            }

        } while (numero != 0);

        System.out.println("La suma de los números pares es: " + sumaPares);
        scanner.close();
    }
}
