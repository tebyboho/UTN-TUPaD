package ejercicio_4;

import java.util.ArrayList;
import java.util.List;


public class ejercicio_4 {
    public static void main(String[] args) {

        // Lista de animales --> upcasting
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Perro"));
        animales.add(new Gato("Gato"));
        animales.add(new Vaca("Vaca"));


        // llamdas polimorficas
        for (Animal animal : animales){
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println();
        }
    }
}
