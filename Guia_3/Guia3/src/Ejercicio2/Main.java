package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Usar la Calculadora Básica
        CalculadoraBasica cBasica = new CalculadoraBasica();
        System.out.println("Calculadora Básica:");
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Suma: " + cBasica.suma(num1, num2));
        System.out.println("Resta: " + cBasica.resta(num1, num2));
        System.out.println("Multiplicación: " + cBasica.multiplicacion(num1, num2));
        System.out.println("División: " + cBasica.division(num1, num2));

        // Usar la Calculadora Avanzada
        CalculadoraAvanzada cAvanzada = new CalculadoraAvanzada();
        System.out.println("\nCalculadora Avanzada:");
        System.out.print("Ingrese la base para la potencia: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el exponente: ");
        double exponente = scanner.nextDouble();
        System.out.println("Potencia: " + cAvanzada.potencia(base, exponente));

        System.out.print("Ingrese un número para calcular su opuesto: ");
        double numero = scanner.nextDouble();
        System.out.println("Opuesto: " + cAvanzada.opuesto(numero));

        System.out.print("Ingrese un número para calcular su factorial: ");
        int factorialNum = scanner.nextInt();
        System.out.println("Factorial: " + cAvanzada.factorial(factorialNum));

        scanner.close();
    }
}