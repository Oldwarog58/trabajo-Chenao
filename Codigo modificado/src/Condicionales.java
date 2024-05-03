import javax.swing.JOptionPane;

public class Condicionales {
    public static void main(String[] args) {
        String edadString = JOptionPane.showInputDialog(null, "Ingrese la edad:");
        int edad = Integer.parseInt(edadString);

        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "La persona es mayor de edad!!!");
        } else {
            JOptionPane.showMessageDialog(null, "La persona es menor de edad !!!");
        }
    }
}


