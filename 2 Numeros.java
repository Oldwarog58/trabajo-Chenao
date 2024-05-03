import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumaejercicio6 {
    public static void main(String[] args) throws IOException {
        DataInputStream dataIn = new DataInputStream(System.in);
        
        System.out.println("Ingrese el primer número:");
        double numero1 = Double.parseDouble(dataIn.readLine());
        
        System.out.println("Ingrese el segundo número:");
        double numero2 = Double.parseDouble(dataIn.readLine());
        
        double suma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        
        dataIn.close();
    }
}

