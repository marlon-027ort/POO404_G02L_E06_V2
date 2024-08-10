package Ejercicio3;

public class Perro extends Animal {
    private String colorPelaje;

    public Perro(String nombre, int edad, String alimento, String colorPelaje) {
        super(nombre, edad, alimento);
        this.colorPelaje = colorPelaje;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Color de Pelaje: " + colorPelaje);
    }
}