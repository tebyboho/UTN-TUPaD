
package ejercicios_tp3;


public class Ejercicio_4 {
    public static void main(String args[]){
        
        Gallina g1 = new Gallina();
        g1.idGallina = 156;
        g1.edad = 2;
        g1.huevosPuestos = 75;
        
        Gallina g2 = new Gallina();
        g2.idGallina = 231;
        g2.edad = 1;
        g2.huevosPuestos = 31;
        
        
        g1.mostrarEstado();
        g2.mostrarEstado();
        
        g1.envejecer();
        g2.envejecer();
        
        g1.ponerHuevo(5);
        g2.ponerHuevo(2);
        
        g1.mostrarEstado();
        g2.mostrarEstado();
        
        
    }
}
