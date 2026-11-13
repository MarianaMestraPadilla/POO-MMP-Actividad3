package Ejercicio2_T19;

public class Main {
    public static void main(String[] args) {
        GestorArchivos gestorLocal = new GestorArchivos(new AlmacenamientoLocal());
        gestorLocal.procesarArchivo("taller_solid.java", "public class Main {}");

        System.out.println("---");

        GestorArchivos gestorNube = new GestorArchivos(new AlmacenamientoNube());
        gestorNube.procesarArchivo("respaldo_bd.sql", "SELECT * FROM usuarios;");
    }
}
