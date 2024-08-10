package Guia2;

import javax.swing.JOptionPane;


public class Ejercicio3 {

    public static void main(String[] args) {

        String leer;
        double sueldo;
        int i = 1;
        String sueldosIngresados = "";

        while (i <= 5) {
            leer = JOptionPane.showInputDialog("Ingrese el Sueldo del Empleado " + i);

            try {
                sueldo = Double.parseDouble(leer);

                if (sueldo < 0) {
                    JOptionPane.showMessageDialog(null, "El sueldo no puede ser negativo, ingrese un valor positivo.");
                    continue;
                }

                sueldosIngresados += "Sueldo del Empleado " + i + ": $" + sueldo + "\n";

                i = i + 1;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "La entrada no es un número válido. Intente nuevamente.");
            }
        }

        JOptionPane.showMessageDialog(null, "Sueldos ingresados:\n" + sueldosIngresados);
       }

    }



