package ejercomple;

public class InstanciaEstudiante {
    public static void main(String[] args){
        Estudiante estudiante = new Estudiante("Zaidy Tobar", 20,"Tecnico");
        String[] materias = {
                "Matemáticas",
                "Física",
                "Programación",
                "Historia",
                "Literatura"
        };
        estudiante.ingresarMaterias(materias);

        // Mostrar la información del estudiante
        estudiante.mostrarInformacion();
    }
}

