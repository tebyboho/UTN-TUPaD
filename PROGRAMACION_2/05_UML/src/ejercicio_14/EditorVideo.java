package ejercicio_14;

public class EditorVideo {

    // Dependencia de creación
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato);
        render.setProyecto(proyecto);

        System.out.println("Render exportado: " + render);
    }
}
