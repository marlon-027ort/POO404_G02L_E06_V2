package ejemplo15;
import java.util.Scanner;

public class EvaluacionNota {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la nota del alumno: ");
            double nota = scanner.nextDouble();

            if (nota >= 7.0) {
                System.out.println("El alumno ha aprobado.");
            } else if (nota >= 6.5 && nota < 7.0) {
                System.out.println("El alumno tiene la posibilidad de realizar un examen de suficiencia.");
            } else {
                System.out.println("El alumno no ha aprobado.");
            }

            scanner.close();
        }
    }

