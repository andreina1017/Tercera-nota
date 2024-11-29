import java.util.Scanner;

public class NumeroPrimo {
    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }
        
        // Solo verificamos hasta la raíz cuadrada de 'numero'
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;  
            }
        }
        return true; 
    }
    
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número para verificar si es primo: ");
        int numero = scanner.nextInt();

        // Verificar si el número ingresado es primo
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " NO es un número primo.");
        }

        // Imprimir todos los números primos entre 1 y 100
        System.out.println("Números primos entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

