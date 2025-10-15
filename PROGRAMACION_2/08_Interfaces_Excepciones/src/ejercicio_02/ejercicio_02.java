package ejercicio_02;

import java.util.Scanner;

public class ejercicio_02 {
    public static void main(String[] args) {
        // Ejercicio 2.1: División segura
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el dividendo: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingrese el divisor: ");
        int num2 = sc.nextInt();
        
        try {
            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
        
        sc.close();
    }
}
