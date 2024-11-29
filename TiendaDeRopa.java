public class TiendaDeRopa {
    public static void main(String[] args) {
        // Precios originales de las prendas
        double precioCamiseta = 25.0;  
        double precioPantalon = 30.0;  

        // Descuentos
        double descuentoGeneral = 0.15;  
        double descuentoAdicional = 0.05;  

        double precioCamisetaConDescuento = precioCamiseta - (precioCamiseta * descuentoGeneral);

        double precioPantalonConDescuento = precioPantalon - (precioPantalon * descuentoGeneral);

        double precioSegundaCamiseta = precioCamisetaConDescuento - (precioCamisetaConDescuento * descuentoAdicional);

        double precioTotal = precioCamisetaConDescuento + precioPantalonConDescuento + precioSegundaCamiseta;

        System.out.println("Precio camiseta con descuento: $" + precioCamisetaConDescuento);
        System.out.println("Precio pantalón con descuento: $" + precioPantalonConDescuento);
        System.out.println("Precio segunda camiseta con descuento adicional: $" + precioSegundaCamiseta);
        System.out.println("Precio total de ambas prendas: $" + String.format("%.2f", precioTotal));
    }
}
