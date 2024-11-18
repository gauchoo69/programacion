import java.util.Scanner;

public class ejercicio4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entre 1 y 99: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 99) {
            System.out.println("El número debe estar entre 1 y 99.");
        } else {
            System.out.println("El número en letras es: " + convertirANumerosEnLetras(numero));
        }

        scanner.close();
    }

    public static String convertirANumerosEnLetras(int numero) {
        String[] unidades = {
                "zero", "un", "do", "tres", "catro", "cinco", "seis", "sete", "oito", "nove",
                "dez", "once", "doce", "trece", "catorce", "quince", "dezaseis", "dezasete",
                "dezoito", "dezanove"
        };

        String[] decenas = {
                "", "", "vinte", "trinta", "cuarenta", "cinquenta", "sesenta", "setenta",
                "oitenta", "noventa"
        };

        if (numero < 20) {
            return unidades[numero];
        } else {
            int decena = numero / 10;
            int unidad = numero % 10;

            if (unidad != 0) {
                return decenas[decena] + " e " + unidades[unidad];
            } else {
                return decenas[decena];
            }
        }
    }
}

