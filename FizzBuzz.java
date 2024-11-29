public class FizzBuzz {
    public static void main(String[] args) {
        // Recorrer los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Comprobar si el número es múltiplo de 3 y 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            }
            // Comprobar si el número es múltiplo de 3
            else if (i % 3 == 0) {
                System.out.println("fizz");
            }
            // Comprobar si el número es múltiplo de 5
            else if (i % 5 == 0) {
                System.out.println("buzz");
            }
            // Si no es múltiplo de 3 ni de 5, mostrar el número
            else {
                System.out.println(i);
            }
        }
    }
}

