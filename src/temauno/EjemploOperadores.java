package TemaUno;
public class EjemploOperadores{
        public static void main(String[] args) {
            int x = 5;
            int y = 10;

            boolean resultado = (++x > 5) && (y-- < 10);// false (6)&& (10)
    
            IO.println(resultado);

            int m = 4;
            int n = 7;

            resultado = !(m * 2 > n++) || (m + ++n == 13); // (false) (false)
            IO.println(resultado);
}
    
}
