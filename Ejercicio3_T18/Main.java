package Ejercicio3_T18;

public class Main {
    public static void main(String[] args) {
        Conducible auto = new Automovil();
        auto.conducir();

        Camion camion = new Camion();
        camion.cargarMercancia(5000);
        camion.conducir();
    }
}
