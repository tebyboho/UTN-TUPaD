package ejercicio_13;

public class ejercicio_13 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Teby", "teby@correo.com");
        GeneradorQR generador = new GeneradorQR();

        generador.generar("ABC123XYZ", usuario);
    }
}
