
package ejercicios_tp3;
import java.util.Scanner;

public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
    public void mostrarEstado(){
        System.out.println(String.format("Gallina numero: %d %d años.", this.idGallina, this.edad));
        System.out.println(String.format("%d huevos puestos.", this.huevosPuestos));
    }
    
    public void envejecer(){
        this.edad += 1;
    }
    public void ponerHuevo(int cantHuevos){
        this.huevosPuestos = this.huevosPuestos + cantHuevos;
    }
    
    
}
