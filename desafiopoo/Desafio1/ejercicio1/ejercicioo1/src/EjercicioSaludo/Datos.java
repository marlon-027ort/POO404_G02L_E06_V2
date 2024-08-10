package EjercicioSaludo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datos {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public static boolean esBisiesto(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int calcularEdad(Date fechaNacimiento) {
        Calendar nacimiento = Calendar.getInstance();
        nacimiento.setTime(fechaNacimiento);
        Calendar hoy = Calendar.getInstance();
        int edad = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);
        if (hoy.get(Calendar.DAY_OF_YEAR)< nacimiento.get(Calendar.DAY_OF_YEAR)){
            edad--;
        }
        return edad;
    }
    public static String obtenerDiaDeLaSemana(Date fechaNacimiento){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaNacimiento);
        String[] dias = {"doming", "lunes", "martes","miercoles","jueves", "viernes" ,"sabado"};
        int diaSemana = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        return dias[diaSemana];
    }

    public static Date parseFecha(String fecha) throws ParseException{
        dateFormat.setLenient(false);
        return dateFormat.parse(fecha);
    }
}
