package Ejercicio1_T18;

public class Main {
    public static void main(String[] args) {
        Reparable tecnico = new TecnicoReparaciones();
        Limpiable aseador = new PersonalAseo();

        tecnico.realizarReparacion();
        aseador.realizarLimpieza();
    }
}
