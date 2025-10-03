package ejercicio_2;

public class Circulo extends Figura {

    private double radio;

    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }

    // uso del metodo abstracto, calculando area para el circulo
    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }

}
