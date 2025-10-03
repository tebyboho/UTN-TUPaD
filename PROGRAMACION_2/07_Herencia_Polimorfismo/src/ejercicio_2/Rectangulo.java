package ejercicio_2;

public class Rectangulo extends Figura{
    private double ancho;
    private double alto;


    public Rectangulo(String nombre, double ancho, double alto){
        super(nombre);
        this.ancho = ancho;
        this.alto = alto;
    }

    // uso del metodo abstracto, calculando area para el rectangulo
    @Override 
    public double calcularArea(){
        return ancho * alto;
    }

}
