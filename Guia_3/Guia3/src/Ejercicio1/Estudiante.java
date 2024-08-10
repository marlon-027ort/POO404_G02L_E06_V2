package Ejercicio1;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String idEstudiante;
    private ArrayList<String> materias;

    public Estudiante(String nombre, String apellido, int edad, String idEstudiante) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.idEstudiante = idEstudiante;
        this.materias = new ArrayList<>();
    }

    public void ingresarMaterias() {
        System.out.println("Ingrese 5 materias que cursa el estudiante:");
        for (int i = 0; i < 5; i++) {
            String materia = System.console().readLine(String.format("Materia %d: ", i + 1));
            materias.add(materia);
        }
    }

    public void mostrarInformacion() {
        System.out.println("\nInformación del Estudiante:");
        System.out.printf("Nombre: %s %s%n", nombre, apellido);
        System.out.printf("Edad: %d%n", edad);
        System.out.printf("ID Estudiante: %s%n", idEstudiante);
        System.out.println("Materias Cursadas:");
        for (String materia : materias) {
            System.out.printf("- %s%n", materia);
        }
    }
}
