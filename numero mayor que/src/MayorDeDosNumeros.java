import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("El mayor número es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El mayor número es: " + num2);
        } else {
            System.out.println("Los dos números son iguales.");
        }
    }
}
