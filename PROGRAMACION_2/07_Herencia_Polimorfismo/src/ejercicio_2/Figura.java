package ejercicio_2;

abstract class Figura {
    protected String nombre;

    public Figura(String nombre){
        this.nombre = nombre;
    }

    // metodo abstracto, obligando a subclase a implementarlo
    public abstract double calcularArea();

}
