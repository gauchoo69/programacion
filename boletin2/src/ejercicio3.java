import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        double cambio, euro=0, dolares;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce o cambio euro-dolar del día de hoy: " );
        cambio = scanner.nextDouble();

        System.out.println("Introduce la cantidad de euros a cambiar: ");
        double euros = scanner.nextDouble();
        dolares = euro/cambio;

        System.out.println(dolares + "Dolares de cambio, por "+ euros+ "Euros");
        scanner.close ();



    }
}
