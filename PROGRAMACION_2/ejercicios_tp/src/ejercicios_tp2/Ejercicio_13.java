package ejercicios_tp2;


public class Ejercicio_13 {
    public static void main(String[] args) {
        double[] precios = {129.99, 215.0, 149.99, 350.0, 99.99};

        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);

        precios[2] = 179.99;

        System.out.println("Precios modificados:");
        mostrarPrecios(precios, 0);
    }

    public static void mostrarPrecios(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        System.out.println("Precio: $" + precios[indice]);
        mostrarPrecios(precios, indice + 1);
    }
}
