package TemaUno;
public class EjercicioAtraccion { 
    public static void main(String[] args) {
        int edad= 11;
        double altura = 140;
        boolean mini  = true;
        boolean dragon = true;

        dragon = (edad >= 12 && altura >= 140);
        IO.println("Podria entrar al dragon " + dragon);

        mini = (edad <= 12 || altura <= 140);
        IO.println("No podria entrar al mini " + mini);
    }
    
}
