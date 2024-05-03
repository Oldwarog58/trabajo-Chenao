import java.util.Scanner;

public class CalculoPrecioCompra {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio inicial de la compra: ");
        double precioInicial = scanner.nextDouble();

        
        if (precioInicial > 50000) {
            
            double descuento = 0.1 * precioInicial;
            
            double precioFinal = precioInicial - descuento;
            
            System.out.println("El precio final de la compra es: " + precioFinal);
        } else {
            
            System.out.println("El precio final de la compra es: " + precioInicial);
        }
    }
}
