package ejercicio_14;

public class ejercicio_14 {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Mejores Bandas de Rock", 90);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto);
    }
}
