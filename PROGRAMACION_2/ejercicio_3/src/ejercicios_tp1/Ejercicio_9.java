import java.util.Scanner;



public class Ejercicio_9{
    public static void main(String[] args) {
        
        /* 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextInt(); // ERROR
        
        System.out.println("Hola, " + nombre); 
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Hola " + nombre);
    }
}