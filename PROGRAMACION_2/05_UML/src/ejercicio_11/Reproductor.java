package ejercicio_11;

public class Reproductor {
    // Dependencia de uso
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() +
                " - " + cancion.getArtista().getNombre());
    }
}
