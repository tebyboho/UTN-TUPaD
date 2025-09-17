
package ejercicios_tp3;
import java.util.Scanner;

public class Mascota {
    String nombre = "Pipo";
    String especie = "Canino";
    int edad = 6;
    
    public void mostrarInfo(){
        System.out.println(this.nombre + " es de especie: " + this.especie + " y tiene " + this.edad + " años.");
    }
    
    public void cumplirAnios(int anios){
        if (anios > 0 ){
            this.edad = edad + anios;
            mostrarInfo();
        }
    }
}

