package Ejercicio2;

public class CalculadoraAvanzada {

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double opuesto(double numero) {
        return -numero;
    }

    public long factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        }
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}