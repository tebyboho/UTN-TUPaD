
package ejercicios_tp3;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String args[]){
        
        Estudiante a = new Estudiante();
        
        a.mostrarInfo();
        
        a.subirCalificacion(2);
        a.mostrarInfo();
        
        a.bajarCalificacion(3);
        a.mostrarInfo();
        
    }
}
