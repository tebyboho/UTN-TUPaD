package ejercicios_tp5;

public class ejercicio_1 {
    
    public static void main (String [] args) {
        
        // composición: Pasaporte contiene una Foto
        Foto foto = new Foto("imagen_base64_o_ruta.jpg", "jpg");
        Pasaporte pasaporte = new Pasaporte("A1234567", "2025-09-14", foto);

        // asociación bidireccional: Titular <-> Pasaporte
        Titular titular = new Titular("Juan Perez", "12345678");
        pasaporte.setTitular(titular);

        // Mostrar datos mínimos
        System.out.println(pasaporte);
        System.out.println("Titular asociado: " + pasaporte.getTitular());
    }
}
