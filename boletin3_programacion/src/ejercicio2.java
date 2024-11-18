import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce o primeiro número (short): ");
        short numero1 = sc.nextShort();

        System.out.print("Introduce o segundo número (short): ");
        short numero2 = sc.nextShort();

        if (numero1 >= numero2) {
            short resta = (short) (numero1 - numero2);
            System.out.println("A resta é: " + resta);
        }

        short suma = (short) (numero1 + numero2);
        System.out.println("A suma é: " + suma);

        sc.close();
    }
}
