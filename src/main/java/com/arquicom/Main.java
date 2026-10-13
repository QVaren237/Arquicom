package com.arquicom;

public class Main {

    public static void main(String[] args) {
        Heroe heroe1 = new Heroe("Garen", "Guerrero", 100);
        Heroe heroe2 = new Heroe("Lux", "Maga", 80);

        System.out.println("=== Héroe 1 ===");
        heroe1.mostrarInformacion();

        System.out.println("\n=== Héroe 2 ===");
        heroe2.mostrarInformacion();

        // Es static: se consulta desde la clase, no desde un objeto.
        System.out.println("\nCantidad de héroes creados: "
                + Heroe.getCantidadHeroes());
    }
}
