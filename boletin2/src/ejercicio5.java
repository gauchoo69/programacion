import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la distancia en millas");
        double cantidad = scanner.nextDouble();

        double distancia= (cantidad+1852);

        System.out.println("La distancia en metros es: " + distancia);
    }
}