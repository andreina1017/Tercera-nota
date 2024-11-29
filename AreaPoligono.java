import java.util.Scanner;

public class AreaPoligono {
    
    // Función para calcular el área del polígono
    public static double calcularArea(String poligono, double dimension1, double dimension2) {
        double area = 0.0;
        
        // Verificar el tipo de polígono y aplicar la fórmula correspondiente
        if (poligono.equalsIgnoreCase("triangulo")) {
            area = (dimension1 * dimension2) / 2;  
        } else if (poligono.equalsIgnoreCase("cuadrado")) {
            area = dimension1 * dimension1; 
        } else if (poligono.equalsIgnoreCase("rectangulo")) {
            area = dimension1 * dimension2;  
        } else {
            System.out.println("Polígono no soportado.");
            return -1;  // Retornar un valor indicativo de error
        }
        
        return area;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el tipo de polígono
        System.out.println("Ingrese el tipo de polígono (triangulo, cuadrado, rectangulo): ");
        String poligono = scanner.nextLine().toLowerCase();  
        
        // Solicitar las dimensiones dependiendo del tipo de polígono
        double dimension1, dimension2 = 0;
        
        if (poligono.equals("triangulo") || poligono.equals("rectangulo")) {
            System.out.println("Ingrese la base: ");
            dimension1 = scanner.nextDouble();
            
            System.out.println("Ingrese la altura: ");
            dimension2 = scanner.nextDouble();
        } else if (poligono.equals("cuadrado")) {
            System.out.println("Ingrese el lado: ");
            dimension1 = scanner.nextDouble();
            dimension2 = 0;  // No se usa, pero se mantiene la estructura de parámetros
        } else {
            System.out.println("Polígono no reconocido.");
            return;
        }
        
        // Calcular el área utilizando la función
        double area = calcularArea(poligono, dimension1, dimension2);
        
        if (area != -1) {
            System.out.println("El área del " + poligono + " es: " + area);
        }
    }
}

