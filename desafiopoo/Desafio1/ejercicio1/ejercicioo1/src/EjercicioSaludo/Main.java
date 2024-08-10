package EjercicioSaludo;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Se utiliza Scanner para solicitar y leer datos de entrada
        // como el nombre, apellido, sexo y fecha de nacimiento.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.next();
        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.next();

        System.out.println("Ingrese su sexo (Masculino/Femenino): ");
        String sexo = scanner.next();

        System.out.println("Ingrese su fecha de Nacimiento (dd-MM-yyyy): ");
        String fechaNacimiento = scanner.next();

        //Lanza una excepción ParseException si la fecha no tiene el formato correcto.

        try{
            Date fecha = Datos.parseFecha(fechaNacimiento);
            Persona persona = new Persona(nombre,apellido,sexo,fechaNacimiento);

            int edad = Datos.calcularEdad(fecha);

            if (edad >= 30){
                if (persona.getSexo().equalsIgnoreCase("Masculino")){
                    System.out.println("Buenos dias Mr. " + persona.getApellido());
                }
                else {
                    System.out.println("Buenos dias Ms. " + persona.getApellido());

                }
            } else {
                if (persona.getSexo().equalsIgnoreCase("Masculino")){
                    System.out.println("Hola amigo " + persona.getNombre());
                }
                else {
                    System.out.println("Hola amiga "+ persona.getNombre());
                }
            }

            //obtendremos fecha de nacimiento
            //Se extrae el año de nacimiento usando Calendar y se verifica
            // si es un año bisiesto con DateUtils.esBisiesto , Obteniendo el Día de la Semana

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fecha);
            int year = calendar.get(Calendar.YEAR);

            if (Datos.esBisiesto(year)){
                System.out.println("El año en el que tu naciste es bisiesto");
            }
            else {
                System.out.println("El año en que tu naciste no es bisiesto ");
            }

            String diaDeLaSemena = Datos.obtenerDiaDeLaSemana(fecha);
            System.out.println("Naciste un " + diaDeLaSemena + ".");

        } catch (ParseException e){
            System.out.println("Formato de fecha invalida, Por favor ingresa la fecha en formato dd-MM-yyyy");
        }

    }
}

