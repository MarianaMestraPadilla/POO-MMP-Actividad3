package Ejercicio2_T19;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardar(String nombreArchivo, String contenido) {
        System.out.println("Subiendo '" + nombreArchivo + "' al servidor en la nube.");
    }

    @Override
    public String recuperar(String nombreArchivo) {
        return "Contenido descargado de la nube de: " + nombreArchivo;
    }
}
