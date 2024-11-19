public class ejercicio2 {
    public static void main(String[] args) {

        int suma = 0;
        long producto = 1;

        for (int numero = 10; numero <= 90; numero++) {
            suma += numero;
            producto *= numero;
        }

        System.out.println("La suma de los números entre 10 y 90 es: " + suma);
        System.out.println("El producto de los números entre 10 y 90 es: " + producto);
    }
}
