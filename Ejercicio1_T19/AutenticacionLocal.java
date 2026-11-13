package Ejercicio1_T19;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        System.out.println("Validando usuario '" + usuario + "' en la base de datos local...");
        return true;
    }
}
