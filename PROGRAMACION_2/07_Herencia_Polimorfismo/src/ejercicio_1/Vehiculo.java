package ejercicio_1;


// Clase base de vehiculo
public class Vehiculo {
    protected String marca; 
    protected String modelo;

    // Constructor para inicializar el objeto 
    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    // Metodo para mostrar info
    public void mostrarInfo(){
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}
