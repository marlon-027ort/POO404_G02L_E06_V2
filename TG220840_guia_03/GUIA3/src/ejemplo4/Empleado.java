package ejemplo4;
import javax.swing.JOptionPane;

public class Empleado {
    private String nombre;
    private String apellido;


    public void mostrarDatos()
    {
        JOptionPane.showConfirmDialog(null,nombre +" "+apellido);
    }

    public void ingresoDatos()
    {
        nombre=JOptionPane.showInputDialog("Ingrese el Nombre");
        apellido=JOptionPane.showInputDialog("Ingrese el Apellido");
    }

}
