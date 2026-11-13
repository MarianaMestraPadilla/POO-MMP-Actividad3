package Ejercicio2_T18;

public class Main {
    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico();
        cajero.retirar(150000);
        cajero.transferir(300000, "987654321");

        Pagable corresponsal = new CorresponsalBancario();
        corresponsal.pagarFactura("FAC-2026", 85000);
    }
}
