package EjercicioSaludo;

public class Persona {

    //atributos
    private String nombre;
    private String apellido;
    private String sexo;
    private String fechaNacimiento;

    //constructor Inicializara los atributos con los valores proporcionados.
    public Persona(String nombre, String apellido, String sexo, String fechaNacimiento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.sexo=sexo;
        this.fechaNacimiento=fechaNacimiento;

    }

//Proporcionan acceso a los valores de los atributos.
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
}
