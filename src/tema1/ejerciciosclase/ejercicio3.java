public class ejercicio3 { 
    public static void main(String[] args) {
        int numeroA = 15, numeroB = 55, temp = 0;

        IO.println(numeroA);
        IO.println(numeroB);

        temp = numeroA;
        
        numeroA = numeroB;

        numeroB = temp;
        
        IO.println("El numero A ahora es la B: " + numeroA);
        IO.println("EL numero B ahora es la A: " + numeroB);
}
    
}
