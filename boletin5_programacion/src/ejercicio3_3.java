import java.util.Scanner;

public class ejercicio3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base= 0;
        double altura= 0;

        do {
            System.out.print("Introduce la base del rectángulo (valor positivo): ");
            base = scanner.nextDouble();
            if (base <= 0) {
                System.out.println("Error: La base debe ser un número positivo.");
            }
        } while (base <= 0);

        do {
            System.out.print("Introduce la altura del rectángulo (valor positivo): ");
            altura = scanner.nextDouble();
            if (altura <= 0) {
                System.out.println("Error: La altura debe ser un número positivo.");
            }
        } while (altura <= 0);

        double area = base * altura;

        System.out.println("El área del rectángulo es: " + area);

        scanner.close();
    }
}
