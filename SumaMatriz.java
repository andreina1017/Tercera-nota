import java.util.Scanner;

public class SumaMatriz {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de filas de la matriz: ");
        int filas = scanner.nextInt();

        System.out.print("Introduce el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];

        
        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la matriz
        System.out.println("\nLa matriz ingresada es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();  
        }

        int sumaTotal = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaTotal += matriz[i][j];
            }
        }

        System.out.println("\nLa suma de todos los elementos de la matriz es: " + sumaTotal);

        scanner.close();
    }
}

