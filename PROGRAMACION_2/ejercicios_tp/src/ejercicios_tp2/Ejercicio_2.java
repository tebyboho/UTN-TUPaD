
package ejercicios_tp2;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args){
        
        int mayor;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingresa el primer numero: ");
        int num1 = scan.nextInt();
        
        System.out.print("Ingresa el segundo numero: ");
        int num2 = scan.nextInt();
        
        System.out.print("Ingresa el tercer numero: ");
        int num3 = scan.nextInt();
        
        if (num1 >= num2 && num1 >= num3){
            mayor = num1;
        } else if( num2 >= num1 && num2 >= num3){
            mayor = num2;
        } else {
            mayor = num3;
        }
        
        System.out.println("El mayor es: " + mayor);
        
        scan.close();
    }
}
