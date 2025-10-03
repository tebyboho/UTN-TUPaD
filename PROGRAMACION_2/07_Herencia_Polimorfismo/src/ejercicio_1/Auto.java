package ejercicio_1;



// Subclase Auto que hereda de vehivulo 
public class Auto extends Vehiculo {
    private int cantPuertas; // private --> encapsulado


    public Auto(String marca, String modelo, int cantPuertas){
        super(marca, modelo); // Inicializo superclase primero usando super()
        this.cantPuertas = cantPuertas;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo(); // llamo al metodo de la clase base
        System.out.println("Cantidad de puertas: " + cantPuertas );
    }
}
