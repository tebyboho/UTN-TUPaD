package ejercicio_7;

public class Conductor {
    private String nombre;
    private boolean licencia;
    private Vehiculo vehiculo;
    
    public Conductor(String nombre, boolean licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean hasLicencia() {
        return licencia;
    }
    
    public Vehiculo getVehiculo(){
        return this.vehiculo;
    }
    
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        if(vehiculo != null && vehiculo.getConductor() != this){
            vehiculo.setConductor(this);
        }
    }
    
    @Override
    public String toString() {
        return "Conductor[nombre=" + nombre + ", licencia=" + licencia + "]";
    }
}
