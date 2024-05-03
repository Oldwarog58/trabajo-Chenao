import javax.swing.JOptionPane;

public class SumaConJOptionPane {
    public static void main(String[] args) {
        try {
            // Solicitar el primer número
            String input1 = JOptionPane.showInputDialog(null, "Ingrese el primer número:", "Ingrese un número", JOptionPane.QUESTION_MESSAGE);
            double num1 = Double.parseDouble(input1);

            // Solicitar el segundo número
            String input2 = JOptionPane.showInputDialog(null, "Ingrese el segundo número:", "Ingrese otro número", JOptionPane.QUESTION_MESSAGE);
            double num2 = Double.parseDouble(input2);

            // Calcular la suma
            double suma = num1 + num2;

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "La suma es: " + suma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
