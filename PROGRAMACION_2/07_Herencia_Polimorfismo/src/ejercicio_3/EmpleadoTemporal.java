package ejercicio_3;

public class EmpleadoTemporal extends Empleado{
    private double sueldoPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, double sueldoPorHora, int horasTrabajadas){
        super(nombre);
        this.sueldoPorHora = sueldoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo(){
        return sueldoPorHora * horasTrabajadas;
    }

}
