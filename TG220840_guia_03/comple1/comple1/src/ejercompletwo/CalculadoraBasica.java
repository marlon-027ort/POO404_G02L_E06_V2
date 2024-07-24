package ejercompletwo;

public class CalculadoraBasica {

    //metodos para operar

    public int suma(int num1, int num2){
        return num1 + num2;
    }

    public int resta(int num1, int num2){
        return num1 - num2;
    }
    public  int multiplicacion(int num1, int num2){
        return num1 * num2;
    }
    public double division(int num1, int num2){
        if (num2 == 0){
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) num1 / num2;
    }
}
