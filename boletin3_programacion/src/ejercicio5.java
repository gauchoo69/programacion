import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce o segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Introduce o terceiro número: ");
        int num3 = sc.nextInt();

        int maior;
        if (num1 > num2 && num1 > num3) {
            maior = num1;
        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
        } else {
            maior = num3;
        }

        System.out.println("O número maior é: " + maior);

        sc.close();
    }
}
