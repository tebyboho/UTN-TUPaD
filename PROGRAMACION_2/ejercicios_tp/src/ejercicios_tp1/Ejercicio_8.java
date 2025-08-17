package ejercicios_tp1;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Parte A: Usando int
        int num1_int, num2_int;
        System.out.print("Ingrese el primer número (entero): ");
        num1_int = input.nextInt();
        System.out.print("Ingrese el segundo número (entero): ");
        num2_int = input.nextInt();

        // División con enteros 
        int resultado_int = num1_int / num2_int;
        System.out.println("Resultado con int: " + resultado_int);

        // Parte B: Usando double
         double num1, num2;
        System.out.print("Ingrese el primer número (decimal): ");
        num1 = input.nextDouble();
        System.out.print("Ingrese el segundo número (decimal): ");
        num2 = input.nextDouble();

        // División con decimales
        double resultado = num1 / num2;
        System.out.println("Resultado con double: " + resultado);

    }
}
