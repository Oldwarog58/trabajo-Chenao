import java.util.Scanner;

public class SumaConScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingrese el segundo número: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            System.out.println("La suma es: " + (num1 + num2));
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un número válido.");
        } finally {
            scanner.close();
        }
    }
}
