package TemaUno;

public class Ejercicio1 {
    public static final double IVA = 0.21;
    public static void main(String[] args) {
        double precioSinIva = 40000.0;
        double precioConIva = 0.0;
        double descuentoAuto = 3500.0;
        double descuentoExtra = 1500.0;
        double resultado = 0.0;   

        precioConIva = precioSinIva + (precioSinIva * IVA);
        resultado = precioConIva - descuentoAuto - descuentoExtra;

        IO.println("El precio con IVA es: " + precioConIva);
        IO.println("El precio es: " + resultado);
        
    }   
    
}
