import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Calculadora de Superficie ===");
            System.out.println("1. Calcular superficie de un círculo");
            System.out.println("2. Calcular superficie de un triángulo");
            System.out.println("3. Calcular superficie de un rectángulo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    double areaCirculo = Math.PI * Math.pow(radio, 2);
                    System.out.printf("La superficie del círculo es: %.2f\n", areaCirculo);
                    break;

                case 2:
                    System.out.print("Introduce la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Introduce la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    double areaTriangulo = (base * altura) / 2;
                    System.out.printf("La superficie del triángulo es: %.2f\n", areaTriangulo);
                    break;

                case 3:
                    System.out.print("Introduce la base del rectángulo: ");
                    double baseRect = scanner.nextDouble();
                    System.out.print("Introduce la altura del rectángulo: ");
                    double alturaRect = scanner.nextDouble();
                    double areaRectangulo = baseRect * alturaRect;
                    System.out.printf("La superficie del rectángulo es: %.2f\n", areaRectangulo);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 4.");
            }

            System.out.println();
        } while (opcion != 4);

        scanner.close();
    }
}


