package Ejercicio3;

public class Gallo extends Animal {
    private String colorPlumas;

    public Gallo(String nombre, int edad, String alimento, String colorPlumas) {
        super(nombre, edad, alimento);
        this.colorPlumas = colorPlumas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Color de Plumas: " + colorPlumas);
    }
}