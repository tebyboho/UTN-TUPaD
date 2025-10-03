package ejercicio_5;

public class Efectivo implements Pagable{
    private double monto;

    public Efectivo(double monto){
        this.monto = monto;
    }

    @Override
    public void pagar(){
        System.out.println("Pagando en efectivo: $" + monto);
    }
}
