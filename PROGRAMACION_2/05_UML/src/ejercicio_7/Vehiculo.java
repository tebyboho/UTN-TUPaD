package ejercicio_7;

public class Vehiculo {
    private String patente;
    private String modelo;
    // agregación: Vehiculo -> Motor (Motor puede existir independientemente)
    private Motor motor;
    // asociado bidireccional con Conductor
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    // establecer conductor (bidireccional) - mantenido por Vehiculo
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }


    @Override
    public String toString() {
        return "Vehiculo[patente=" + patente + ", modelo=" + modelo + ", motor=" + motor + "]";
    }
}
