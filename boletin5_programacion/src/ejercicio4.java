import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número para ver a súa táboa de multiplicar (0 para saír): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                System.out.println("Táboa de multiplicar do " + numero + ":");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
                System.out.println();
            }
        } while (numero != 0);

        System.out.println("Programa rematado. Grazas por usar a táboa de multiplicar!");
        scanner.close();
    }
}

