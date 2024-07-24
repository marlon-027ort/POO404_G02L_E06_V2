package ejemplo4;

import javax.swing.*;

public class Profesor extends Empleado {
        int sueldo;
        public void mostrar2()
        {
            mostrarDatos();//Metodo heredado de Empleado
            JOptionPane.showMessageDialog(null,sueldo);
        }
        public void ingreso2()
        {
            ingresoDatos();//Metodo heredado de Empleado
            String s=JOptionPane.showInputDialog("Ingrese el sueldo");
  }
}
