import java.io.*;

public class SumaConDataInputStream {
    public static void main(String[] args) {
        DataInputStream input = new DataInputStream(System.in);
        try {
            System.out.print("Ingrese el primer número: ");
            double num1 = Double.parseDouble(input.readLine());

            System.out.print("Ingrese el segundo número: ");
            double num2 = Double.parseDouble(input.readLine());

            System.out.println("La suma es: " + (num1 + num2));
        } catch (Exception e) {
            System.out.println("Error: Ingrese un número válido.");
        }
    }
}
