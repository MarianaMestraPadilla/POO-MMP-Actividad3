package Ejercicio3_T18;

public class Camion implements Conducible, TransportadorMercancia {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el camión de carga por la carretera.");
    }

    @Override
    public void cargarMercancia(double pesoKg) {
        System.out.println("Cargando " + pesoKg + " kg de mercancía en el camión.");
    }
}
