package ejercicio_4;

public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // metodo para hacer sonido
    public void hacerSonido(){
    System.out.println("Sonido generido de animal");
    }

    // Metodo para describir al animal
    public void describirAnimal(){
        System.out.println("Este es un " + nombre);
    }
}
