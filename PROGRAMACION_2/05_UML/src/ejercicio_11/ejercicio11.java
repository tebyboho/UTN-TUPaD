package ejercicio_11;

public class ejercicio11 {
    public static void main(String[] args) {
        Artista artista = new Artista("The Warning", "Rock");
        Cancion cancion = new Cancion("Error");

        cancion.setArtista(artista);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }
}
