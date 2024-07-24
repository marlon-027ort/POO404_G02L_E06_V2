package ejercompletwo;

public class inicializacion {

        public static void main(String[] args) {
            // Crear instancias de las calculadoras
            CalculadoraBasica cbasica = new CalculadoraBasica();
            CalculadoraAvanzada cavanzada = new CalculadoraAvanzada();

            // Probar la calculadora básica
            int suma = cbasica.suma(5, 3);
            int resta = cbasica.resta(10, 7);
            int multiplicacion = cbasica.multiplicacion(4, 6);
            double division = cbasica.division(20, 4);

            System.out.println("Calculadora Básica:");
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            System.out.println("División: " + division);

            // Probar la calculadora avanzada
            double potencia = cavanzada.potencia(2, 3);
            int opuesto = cavanzada.opuesto(5);
            int factorial = cavanzada.factorial(4);

            System.out.println("\nCalculadora Avanzada:");
            System.out.println("Potencia: " + potencia);
            System.out.println("Opuesto: " + opuesto);
            System.out.println("Factorial: " + factorial);
        }
    }
