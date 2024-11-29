public class BuscarNumero {
    public static void main(String[] args) {
        // Iterar sobre los números del 1 al 20
        for (int i = 1; i <= 20; i++) {
            // Si el número es impar o menor o igual a 10, saltar a la siguiente iteración
            if (i % 2 != 0 || i <= 10) {
                continue;  // Salta al siguiente número
            }

            // Si encontramos el primer número par mayor que 10, lo mostramos y salimos del ciclo
            System.out.println("El primer número par mayor que 10 es: " + i);
            break;  // Rompe el ciclo
        }
    }
}
