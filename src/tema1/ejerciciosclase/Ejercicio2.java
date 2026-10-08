public class Ejercicio2 {
    
    public static final double IVA = 0.21;
    public static void main(String[] args) {

        double precio, preciofinal;
        double descuento = 0.05;

        precio = Double.parseDouble(IO.readln("Dime el precio del producto: "));

        IO.println("El precio sin iva es: " + precio);

        preciofinal = precio * (IVA + 1 ); // (precio * iva) + ( precio * 1 )
        IO.println("El precio con IVA es: " + preciofinal);
        
        preciofinal = preciofinal - (preciofinal * descuento);
        IO.println("El precio con descuento es: " + preciofinal);
    }
    
}
