import java.util.Scanner;

public class SueldoAumento {
    public static void main(String[] args) {
        final double incremento_sueldo = 0.30;
        System.out.println("Ingrese el sueldo base del empelado :");
        Scanner scanner = new Scanner(System.in);
        double sueldoBase = scanner.nextDouble();
        double incremento = sueldoBase * incremento_sueldo;
        double sueldo_final = sueldoBase + incremento;

        System.out.println("EL sueldo de el empleado es " + sueldo_final);
    }

}
