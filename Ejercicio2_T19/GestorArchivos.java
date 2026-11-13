package Ejercicio2_T19;

public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void procesarArchivo(String nombre, String datos) {
        almacenamiento.guardar(nombre, datos);
        System.out.println(almacenamiento.recuperar(nombre));
    }
}
