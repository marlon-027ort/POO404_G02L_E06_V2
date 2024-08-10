package Ejercicio3;

public class Gato extends Animal {
    private String colorOjos;

    public Gato(String nombre, int edad, String alimento, String colorOjos) {
        super(nombre, edad, alimento);
        this.colorOjos = colorOjos;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Color de Ojos: " + colorOjos);
    }
}