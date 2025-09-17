package ejercicios_tp3;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int CAPACIDAD_MAXIMA = 100;


    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial > CAPACIDAD_MAXIMA) {
            this.combustible = CAPACIDAD_MAXIMA;
        } else if (combustibleInicial < 0) {
            this.combustible = 0;
        } else {
            this.combustible = combustibleInicial;
        }
    }


    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado 🚀 (consumió 10 de combustible).");
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia * 2; // regla: 2 unidades de combustible por cada "distancia"
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " unidades (consumió " + consumo + " de combustible).");
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad de recarga debe ser positiva.");
            return;
        }
        int nuevoNivel = combustible + cantidad;
        if (nuevoNivel > CAPACIDAD_MAXIMA) {
            combustible = CAPACIDAD_MAXIMA;
            System.out.println(nombre + " se recargó hasta el máximo (" + CAPACIDAD_MAXIMA + ").");
        } else {
            combustible = nuevoNivel;
            System.out.println(nombre + " recargó " + cantidad + " unidades de combustible.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + CAPACIDAD_MAXIMA);
    }
}
