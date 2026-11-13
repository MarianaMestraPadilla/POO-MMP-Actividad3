package Ejercicio1_T19;

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void iniciarSesion(String usuario, String credencial) {
        if (servicioAutenticacion.autenticar(usuario, credencial)) {
            System.out.println("Acceso concedido a: " + usuario);
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}
