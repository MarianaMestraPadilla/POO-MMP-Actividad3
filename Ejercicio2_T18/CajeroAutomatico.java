package Ejercicio2_T18;

public class CajeroAutomatico implements Retirable, Transferible {
    @Override
    public void retirar(double monto) {
        System.out.println("Retirando $" + monto + " en efectivo desde el cajero.");
    }

    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("Transfiriendo $" + monto + " a la cuenta " + cuentaDestino);
    }
}
