public class Fibonacci {
    public static void main(String[] args) {
        // Número de términos que queremos imprimir
        int n = 50;
        
        // Inicializar los dos primeros términos de la sucesión
        long a = 0, b = 1;
        
        // Imprimir los primeros n términos de la sucesión de Fibonacci
        System.out.print("Los primeros " + n + " números de la sucesión de Fibonacci son: ");
        
        // Ciclo para imprimir los primeros 50 números
        for (int i = 1; i <= n; i++) {
            // Imprimir el número actual
            System.out.print(a + " ");
            
            // Calcular el siguiente número de Fibonacci
            long siguiente = a + b;
            
            // Actualizar los valores de a y b para la siguiente iteración
            a = b;
            b = siguiente;
        }
    }
}
