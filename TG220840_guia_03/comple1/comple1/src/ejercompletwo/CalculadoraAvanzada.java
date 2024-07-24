package ejercompletwo;

public class CalculadoraAvanzada {

        public double potencia(double base, double exponente) {
            return Math.pow(base, exponente);
        }

        public int opuesto(int numero) {
            return -numero;
        }

        public int factorial(int numero) {
            if (numero < 0) {
                throw new IllegalArgumentException("El factorial no está definido para números negativos");
            }
            int factorial = 1;
            for (int i = 2; i <= numero; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

