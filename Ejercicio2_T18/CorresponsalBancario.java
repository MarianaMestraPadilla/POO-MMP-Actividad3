package Ejercicio2_T18;

public class CorresponsalBancario implements Pagable {
    @Override
    public void pagarFactura(String referenciaFactura, double monto) {
        System.out.println("Pagando factura #" + referenciaFactura + " por valor de $" + monto);
    }
}
