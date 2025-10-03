package ejercicio_5;

public class Transferencia implements Pagable {
    private String cuentaDestino;

    public Transferencia(String cuentaDestino){
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public void pagar(){
        System.out.println("Pagando mediante transferencia a: " + cuentaDestino);
    }
}
