import java.util.Scanner;

public class CalculoSueldo {
    private static final double PORCENTAJE_INCREMENTO = 0.30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el sueldo inicial del empleado:");
        double sueldoInicial = scanner.nextDouble();

        double incremento = sueldoInicial * PORCENTAJE_INCREMENTO;

        double sueldoFinal = sueldoInicial + incremento;

        System.out.println("El sueldo final del empleado es: " + sueldoFinal);
    }
}
