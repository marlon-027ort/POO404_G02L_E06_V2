package Ejercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        Gallo gallo = new Gallo("Gallo Cluck", 2, "Granos", "Rojo");
        Perro perro = new Perro("Rex", 3, "Croquetas", "Marrón");
        Gato gato = new Gato("Miau", 1, "Pescado", "Verde");
        Hamster hamster = new Hamster("Hammy", 1, "Semillas", 5);

        animales.add(gallo);
        animales.add(perro);
        animales.add(gato);
        animales.add(hamster);

        for (Animal animal : animales) {
            System.out.println("Datos del Animal:");
            animal.mostrarDatos();
            System.out.println();
        }
    }
}