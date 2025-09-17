
package ejercicios_tp3;
import java.util.Scanner;

public class Libro {
    
    private String titulo = "El Caballero de la Aramadura Oxidada";
    private String autor = "Robert Fisher";
    private int anioPublicacion = 1987;
    
    
    public void getTitulo(){
        System.out.println(this.titulo);
    } 
    public void getAutor(){
        System.out.println(this.autor);
    }
    public void getAnioPublicacion(){
        System.out.println(this.anioPublicacion);
    }
    
    public void setAnioPublicacion(int anio){
        if (anio >= 1950){
            anioPublicacion = anio;
        }
    }
}
