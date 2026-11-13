package Ejercicio3_T19;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generar(String datos) {
        System.out.println("Generando documento PDF con los datos: [" + datos + "]");
    }
}
