
package ejercicios_tp1;
import java.util.Scanner;

public class ejercicio_5 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1;
        int num2; 
        
        System.out.println("Ingre el primer numero: ");
        num1 = input.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextInt();
        
        System.out.printf("La suma de %d y %d es: %d%n", num1, num2, num1 + num2);
        System.out.printf("La resta de %d y %d es: %d%n", num1, num2, num1 - num2);
        System.out.printf("El producto entre %d y %d es: %d%n", num1, num2, num1 * num2);
        System.out.printf("La division de %d y %d es: %d%n", num1, num2, num1 / num2);
    }
    
}
