package ejercicio_4;

public class Vaca extends Animal {
    public Vaca(String nombre){
        super(nombre);
    }

    @Override
    public void hacerSonido(){
        System.out.println("Muu muu");
    }
}
