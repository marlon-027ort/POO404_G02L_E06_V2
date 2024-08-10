package Ejercicio3;

// Clase base
class Animal {
    protected String nombre;
    protected int edad;
    protected String alimento;

    public Animal(String nombre, int edad, String alimento) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimento = alimento;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Alimento: " + alimento);
    }
}
