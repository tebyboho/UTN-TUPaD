package ejercicio_2;

public class ejercicio_2 {
    public static void main(String[] args){

        //Array para upcasting
        Figura[] figuras = {
            new Circulo("Circulo", 5.0),
            new Rectangulo("Rectangulo", 4.0, 6.0)
        };

        for(Figura figura : figuras){
            System.out.println("Area de " + figura.nombre + ": " + figura.calcularArea());
        }
    }
}
