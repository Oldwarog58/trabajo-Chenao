import java.io.*;
public class Cuadrado {

    /**
     * estamos creando una clase publica llamada Cuadrado 
     */
    public static void main (String[]args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        /**
         * en esta parte del codigo e esta haciendo una definicion de a BufferedRead em una variable llamada entrada , en la linea 8 se hace ina instancia del Buffered envolviendo a Input que a su vez
         * envuelve System.in
         */
        String num = ""; //
        int numero = 0; //
        int cuad = 0; //
        System.out.print ("Digite Un numero: "); //
        /**
         * Aqui se le esta dando una definicion usando las variables num, numero y cuad a String y  int
         */
        num = entrada.readLine(); //
        numero  = Integer.parseInt(num); //
        cuad = numero*numero; //
        System.out.println("El Cudradado de "+ numero +" es : " + cuad);
        /**
         * aca se le da la orden aritmetica que debe cumplir cada variable  
         */
    }
}
