package ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class ejercicio_3 {
    public static void main (String [] args){

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Juan", 3000.0));
        empleados.add(new EmpleadoTemporal("Ana", 20.0, 160));


        for (Empleado emp : empleados){
            // uso de instanceof para clasificar el tipo de emp
            System.out.println("Sueldo de " + emp.nombre + ": " + emp.calcularSueldo());
            if (emp instanceof EmpleadoPlanta){
                System.out.println("Tipo: Planta");
            } else if (emp instanceof EmpleadoTemporal){
                System.out.println("Tipo: Temporal");
            }
        }
    }
}
