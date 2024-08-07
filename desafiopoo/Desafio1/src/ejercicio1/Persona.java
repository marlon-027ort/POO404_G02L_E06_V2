package ejercicio1;
import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {

        // atributos
        String nombre;
        String apellido;
        String fechadeNacimiento;

        //constructor
        public Persona(){
            String nombre = " ";
            String apellido = " ";
            String fechadeNacimiento = " ";
        }
         public Persona(String nombre, String apellido, String fechadeNacimiento) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechadeNacimiento = fechadeNacimiento;

        }
        public void IngresodeDatos () {
            nombre = JOptionPane.showInputDialog("Ingrese su nombre");
            apellido = JOptionPane.showInputDialog("Ingrese su apellido");
            fechadeNacimiento = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento");

        }
        public void MostrarDatos () {
            System.out.println("su nombre es: " + nombre);
            System.out.println("su apellido es: " + apellido);
            System.out.println("su fecha de nacimiento es: " + fechadeNacimiento);
        }
    }
