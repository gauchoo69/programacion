import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número
        System.out.print("Introduce un número: ");
        double numero = scanner.nextDouble();

        // Calcular el valor absoluto utilizando el operador ternario
        double valorAbsoluto = (numero < 0) ? -numero : numero;

        // Mostrar el resultado
        System.out.printf("El valor absoluto de %.2f es: %.2f\n", numero, valorAbsoluto);

        scanner.close();
    }
}

