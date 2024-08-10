package Guia2;

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String Bolita="";
        String Color1 = "Rojo";
        String Color2 = "Verde";
        String Color3 = "Blanco";

        System.out.print("Ingrese el color de la bolita (Rojo, Verde o Blanco): ");
        Bolita=reader.nextLine();

        if(Bolita.equalsIgnoreCase(Color1)){
            System.out.print("Ha ganado un 10% de descuento");
        }

        else if(Bolita.equalsIgnoreCase(Color2)) {
            System.out.print("Ha ganado un 5%de descuento");
        }

        else if (Bolita.equalsIgnoreCase(Color3) ){
            System.out.print("No tiene descuento, Gracias por participar");
        }

    }

}
