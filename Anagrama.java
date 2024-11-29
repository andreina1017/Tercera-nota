import java.util.Arrays;

public class Anagrama {
    // Función para verificar si dos palabras son anagramas
    public static boolean esAnagrama(String palabra1, String palabra2) {
        // Ignorar mayúsculas y minúsculas
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();
        
        // Si las palabras son iguales, no son anagramas
        if (palabra1.equals(palabra2)) {
            return false;
        }
        
        // Si las longitudes son diferentes, no pueden ser anagramas
        if (palabra1.length() != palabra2.length()) {
            return false;
        }
        
        // Convertir las palabras en arreglos de caracteres
        char[] arreglo1 = palabra1.toCharArray();
        char[] arreglo2 = palabra2.toCharArray();
        
        // Ordenar los arreglos de caracteres
        Arrays.sort(arreglo1);
        Arrays.sort(arreglo2);
        
        // Comparar los arreglos ordenados
        return Arrays.equals(arreglo1, arreglo2);
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        String palabra1 = "amor";
        String palabra2 = "roma";
        
        // Llamar a la función esAnagrama y mostrar el resultado
        if (esAnagrama(palabra1, palabra2)) {
            System.out.println(palabra1 + " y " + palabra2 + " son anagramas.");
        } else {
            System.out.println(palabra1 + " y " + palabra2 + " NO son anagramas.");
        }
    }
}
