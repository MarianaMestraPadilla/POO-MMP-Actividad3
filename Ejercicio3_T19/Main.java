package Ejercicio3_T19;

public class Main {
    public static void main(String[] args) {
        GestorReportes gestorPDF = new GestorReportes(new ReportePDF());
        gestorPDF.exportar("Ventas mensuales - Noviembre 2026");

        System.out.println("---");

        GestorReportes gestorExcel = new GestorReportes(new ReporteExcel());
        gestorExcel.exportar("Inventario general - Sede Cartagena");
    }
}
