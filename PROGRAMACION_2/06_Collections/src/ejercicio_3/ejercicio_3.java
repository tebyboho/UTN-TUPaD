package ejercicio_3;

public class ejercicio_3 {
    public static void main(String[] args) {
        
        Universidad universidad = new Universidad("Universidad Nacional");

        // Crear al menos 3 profesores y 5 cursos
        Profesor prof1 = new Profesor("P001", "Dr. Juan Pérez", "Matemáticas");
        Profesor prof2 = new Profesor("P002", "Dra. María López", "Física");
        Profesor prof3 = new Profesor("P003", "Dr. Carlos García", "Química");

        Curso curso1 = new Curso("C001", "Álgebra", null);
        Curso curso2 = new Curso("C002", "Cálculo", null);
        Curso curso3 = new Curso("C003", "Mecánica", null);
        Curso curso4 = new Curso("C004", "Química Orgánica", null);
        Curso curso5 = new Curso("C005", "Física Cuántica", null);

        // Agregar profesores y cursos a la universidad
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);

        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);

        // Asignar profesores a cursos usando asignarProfesorACurso(...)
        universidad.asignarProfesorACurso("C001", "P001");
        universidad.asignarProfesorACurso("C002", "P001");
        universidad.asignarProfesorACurso("C003", "P002");
        universidad.asignarProfesorACurso("C004", "P003");
        universidad.asignarProfesorACurso("C005", "P002");

        // Listar cursos con su profesor y profesores con sus cursos
        System.out.println("=== Cursos con su profesor ===");
        universidad.listarCursos();

        System.out.println("=== Profesores con sus cursos ===");
        universidad.listarProfesores();

        // Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados
        System.out.println("=== Cambiando profesor de C001 de P001 a P002 ===");
        universidad.asignarProfesorACurso("C001", "P002");
        System.out.println("Cursos de P001:");
        prof1.listarCursos();
        System.out.println("Cursos de P002:");
        prof2.listarCursos();

        // Remover un curso y confirmar que ya no aparece en la lista del profesor
        System.out.println("=== Removiendo curso C005 ===");
        universidad.eliminarCurso("C005");
        System.out.println("Cursos de P002 después de remover C005:");
        prof2.listarCursos();

        // Remover un profesor y dejar profesor = null
        System.out.println("=== Removiendo profesor P003 ===");
        universidad.eliminarProfesor("P003");
        System.out.println("Profesor de C004 después de remover P003:");
        curso4.mostrarInfo();

        // Mostrar un reporte: cantidad de cursos por profesor
        System.out.println("=== Reporte: Cantidad de cursos por profesor ===");
        for (Profesor p : universidad.getProfesores()) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos");
        }
    }
}
