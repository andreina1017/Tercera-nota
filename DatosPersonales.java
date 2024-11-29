import java.util.Scanner;

public class DatosPersonales {
    public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        String nombre = scanner.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = scanner.nextInt();

        System.out.print("¿Cuánto mides en metros? ");
        double altura = scanner.nextDouble();

        System.out.println("\nHola " + nombre + ", tienes " + edad + " años y mides " + altura + " metros.");

        scanner.close();
    }
}

