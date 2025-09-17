
package ejercicios_tp2;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingresa tu edad: ");
        int edad = scan.nextInt();
        
        if (edad < 0){
            System.out.println("La edad no puede ser menor a 0");
        } else if( edad < 12 ){
            System.out.println("Niño/a");
        } else if( edad <= 17){
            System.out.println("Adolescente");
        } else if( edad <= 59){
            System.out.println("Adulto");
        } else{
            System.out.println("Adulto mayor");
        }
        
        scan.close();
    }
    
}
