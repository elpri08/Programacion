package temauno;

public class ejemplo {

 public static void main(String[] args) {
    
    int edad;
    double precioConIVA;
    double precioSinIVA;
    boolean gratis;

    edad = 25; 
    gratis = true; 
    precioSinIVA = 99.99;
    precioConIVA = precioSinIVA * 1.21;

    IO.println("La edad es " + edad);
    IO.println("El precio sin IVA es " + precioSinIVA);
    IO.println("El precio con IVA es " + precioConIVA);
   
    IO.println ("Es gratis + gratis");
    }
   
}


