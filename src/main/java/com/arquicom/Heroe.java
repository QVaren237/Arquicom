package com.arquicom;

/**
 * Representa a un heroe del juego.
 */
public class Heroe {
    private String nombre;
    private String tipo;
    private int hp;

    // Variable compartida por todos los heroes.
    private static int cantidadHeroes = 0;

    // Constructor: establece los datos iniciales del heroe.
    public Heroe(String nombre, String tipo, int hp) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.hp = hp;
        cantidadHeroes++;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("HP: " + hp);
    }

    public static int getCantidadHeroes() {
        return cantidadHeroes;
    }
}
