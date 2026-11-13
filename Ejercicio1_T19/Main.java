package Ejercicio1_T19;

public class Main {
    public static void main(String[] args) {
        ServicioAutenticacion local = new AutenticacionLocal();
        GestorAutenticacion gestor1 = new GestorAutenticacion(local);
        gestor1.iniciarSesion("admin_cartagena", "12345");

        System.out.println("---");

        ServicioAutenticacion oauth = new AutenticacionOAuth();
        GestorAutenticacion gestor2 = new GestorAutenticacion(oauth);
        gestor2.iniciarSesion("Mariana@gmail.com", "token_xyz");
    }
}
