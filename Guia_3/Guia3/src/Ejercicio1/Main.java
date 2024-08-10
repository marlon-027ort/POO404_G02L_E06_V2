package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del estudiante: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el ID del estudiante: ");
        String idEstudiante = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, apellido, edad, idEstudiante);
        estudiante.ingresarMaterias();
        estudiante.mostrarInformacion();
    }
}
