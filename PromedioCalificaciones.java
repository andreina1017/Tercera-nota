import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar el contador y el acumulador
        int contador = 0;
        double acumulador = 0.0;
        double calificacion;

        // Solicitar las calificaciones
        System.out.println("Introduce las calificaciones de los estudiantes.");
        System.out.println("Introduce -1 para terminar.");

        // Usar un ciclo para ingresar calificaciones
        while (true) {
            // Solicitar la calificación de un estudiante
            System.out.print("Ingrese la calificación del estudiante (o -1 para terminar): ");
            calificacion = scanner.nextDouble();

            // Condición para salir del ciclo
            if (calificacion == -1) {
                break;  // Sale del ciclo cuando el usuario ingresa -1
            }

            // Acumular la calificación y aumentar el contador
            acumulador += calificacion;
            contador++;
        }

        // Verificar si se ingresaron calificaciones
        if (contador > 0) {
            // Calcular el promedio
            double promedio = acumulador / contador;

            // Mostrar el resultado
            System.out.println("Número total de estudiantes: " + contador);
            System.out.println("Suma total de las calificaciones: " + acumulador);
            System.out.println("El promedio de las calificaciones es: " + promedio);
        } else {
            // Mensaje si no se ingresaron calificaciones
            System.out.println("No se ingresaron calificaciones.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

