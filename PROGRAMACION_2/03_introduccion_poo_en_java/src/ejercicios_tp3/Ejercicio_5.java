package ejercicios_tp3;

public class Ejercicio_5 {
    public static void main(String[] args) {
        
        // Crear nave con 50 de combustible
        NaveEspacial nave = new NaveEspacial("Andrómeda", 50);
        nave.mostrarEstado();
        
        // Intentar avanzar sin recargar
        nave.avanzar(30); // debería fallar porque requiere 60 de combustible
        
        // Recargar
        nave.recargarCombustible(40); 
        
        // Despegar y avanzar correctamente
        nave.despegar();
        nave.avanzar(20);
        
        // Mostrar estado final
        nave.mostrarEstado();
    }
}
