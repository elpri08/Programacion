package TemaUno;

public class EjercicioHipotenusa {
    public static void main(String[] args) {
        double cateto1 = 2.0;
        double cateto2 = 5.0;
        double hipotenusa = 0.0;
        hipotenusa = Math.sqrt((cateto2 * cateto2 )+ (cateto1 * cateto1));
        
        IO.println("El cateto1 es:" + cateto1);
        IO.println("El cateto1 es:" + cateto2);
        IO.println("La hipotenusa es:" + hipotenusa);

    }
    
}
