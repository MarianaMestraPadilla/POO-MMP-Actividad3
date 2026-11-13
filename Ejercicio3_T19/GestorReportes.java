package Ejercicio3_T19;

public class GestorReportes {
    private GeneradorReporte generadorReporte;

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void exportar(String datos) {
        generadorReporte.generar(datos);
    }
}
