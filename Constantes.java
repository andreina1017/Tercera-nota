public class Constantes {
    // Definición de constantes
    public static final int EDAD_MINIMA_MAYOR_EDAD = 18;  
    public static final double ALTURA_MAXIMA_PARK = 2.0;  

    public static void main(String[] args) {
        // Declaración y asignación de variables
        int edad = 20;               
        double altura = 1.75;         
        char inicialNombre = 'A';     
        boolean esMayorDeEdad = edad >= EDAD_MINIMA_MAYOR_EDAD; 

        // Verifica si la persona cumple con la altura máxima para el parque
        boolean puedeIrAlParque = altura <= ALTURA_MAXIMA_PARK;

        // Imprimir los valores de las variables y resultados
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial del nombre: " + inicialNombre);
        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
        System.out.println("¿Puede ir al parque? " + puedeIrAlParque);
    }
}

