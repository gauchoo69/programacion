import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos
        Scanner sc = new Scanner(System.in);

        // Solicitar el nombre del artículo
        System.out.print("Introduce o nome do artigo: ");
        String nomeArtigo = sc.nextLine();

        // Solicitar las ventas anuales
        System.out.print("Introduce as vendas anuais do artigo: ");
        int vendas = sc.nextInt();

        // Determinar el tipo de artículo según las ventas anuales
        String tipo;
        if (vendas <= 100) {
            tipo = "baixo";
        } else if (vendas <= 500) {
            tipo = "medio";
        } else if (vendas <= 1000) {
            tipo = "alto";
        } else {
            tipo = "primeira necesidade";
        }

        // Mostrar el resultado
        System.out.println("O artigo '" + nomeArtigo + "' é de tipo: " + tipo);

        // Cerrar el Scanner
        sc.close();
    }
}

