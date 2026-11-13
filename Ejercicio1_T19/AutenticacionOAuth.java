package Ejercicio1_T19;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        System.out.println("Validando usuario '" + usuario + "' mediante token OAuth externo...");
        return true;
    }
}
