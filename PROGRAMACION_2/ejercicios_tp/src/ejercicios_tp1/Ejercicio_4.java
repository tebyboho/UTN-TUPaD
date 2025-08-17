package ejercicios_tp1;
import java.util.Scanner;

public class Ejercicio_4 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.println("Ingresa tu nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Ingresa tu edad: ");
        edad = input.nextInt();
        
        System.out.println("Te llamas " + nombre + " y tenes " + edad + " años.");
    }
}
