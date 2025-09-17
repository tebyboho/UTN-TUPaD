package ejercicio_tp4;

public class Ejercicio_1 {
    public static void main(String[] args){
        
        // constructor que solo recibe nombre y puesto
        Empleado e1 = new Empleado("Ana Pérez", "Developer");
        
        // constructor que recibe todos los parametros
        Empleado e2 = new Empleado(10, "Juan Gómez", "Analista", 45000.0);
        
        // Llamando metodos de instancias
        System.out.println(e1);
        System.out.println(e2);

        e1.actualizarSalario(10);    // +10%
        e2.actualizarSalario(2000);  // +2000 fijo

        System.out.println("Después de incrementos:");
        System.out.println(e1);
        System.out.println(e2);
        
        // Llamando metodo de la Clase Empleado
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
}