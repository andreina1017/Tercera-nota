import java.util.Scanner;

public class NumerosNWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número N: ");
        int N = scanner.nextInt();

        // Usar un ciclo 'while' para imprimir los primeros N números naturales
        System.out.println("Los primeros " + N + " números naturales son:");
        int i = 1;
        while (i <= N) {
            System.out.print(i + " ");  
            i++;  
        }

        scanner.close();
    }
}

