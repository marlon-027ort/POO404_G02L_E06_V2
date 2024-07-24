package ejercomple;

public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private String[] materias;


    //constructor de estudiante
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.materias = new String[5]; //las 5 materias se definen en ese array
    }

    public void ingresarMaterias(String[] materias) {
        if (materias.length > 5) {
            System.out.println("Error: no se pueden ingresar mas de 5 materias como limite.");
            return;
        }
        this.materias = materias;
    }

    public void mostrarInformacion() {
        System.out.println("Datos del estudiante:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Materias cursadas:");
        for (String materia : this.materias) {
            if (materia != null) {
                System.out.println(materia);
            }

        }
    }
}