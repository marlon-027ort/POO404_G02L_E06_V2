package Ejercicio3;

public class Hamster extends Animal {
    private int cantidadPulgas;

    public Hamster(String nombre, int edad, String alimento, int cantidadPulgas) {
        super(nombre, edad, alimento);
        this.cantidadPulgas = cantidadPulgas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cantidad de Pulgas: " + cantidadPulgas);
    }
}