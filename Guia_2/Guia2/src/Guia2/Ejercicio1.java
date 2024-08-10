package Guia2;

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double Var1;
        System.out.print("Ingrese la nota del alumno: ");
        Var1=reader.nextDouble();

        if(Var1 >=7){
            System.out.print("El alumno aprobo la materia");
        }

        else if(Var1 ==6.49) {
            System.out.print("El alumno reprobo la materia");
        }

        else if (Var1 >= 6.50 && Var1 <= 6.99){
            System.out.print("El alumno debe realizar un examen para aprobar");
        }

    }
}