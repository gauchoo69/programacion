import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double numero = sc.nextDouble();

        if (numero > 0) {
            System.out.println("É un número positivo.");
        }
        sc.close();
    }
}

