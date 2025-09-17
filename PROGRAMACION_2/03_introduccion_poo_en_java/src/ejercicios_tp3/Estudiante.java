
package ejercicios_tp3;
import java.util.Scanner;

public class Estudiante {
    
    String nombre = "Esteban";
    String apellido = "Bohorquez";
    String curso = "6";
    int calificacion = 8;
    
    public void mostrarInfo(){
        System.out.println("Estudiante: " + this.nombre + " " + this.apellido);
        System.out.println("Curso: " + this.curso + " "+ "Calificacion: " + this.calificacion);
    }
    
    public void subirCalificacion(int puntos){
        if (puntos > 0 && (puntos + this.calificacion <= 10)){
            calificacion = calificacion + puntos;
        } else {
            System.out.println("No se puede subir esa cantidad de puntos");
        }
    }
    
    public void bajarCalificacion(int puntos){
        if (puntos >0 && (puntos + this.calificacion >= 1)){
            calificacion = calificacion - puntos;
        } else{
            System.out.println("No se puede bajar esa cantidad de puntos");
        }
    }
}
