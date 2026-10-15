package ejecicioscasa;

public class ejercicio11 { 
    public static void main(String[] args) {
        
        int numero = 0;
        int unidades = 0;
        int decenas = 0;
        int resultado = 0;

        numero = Integer.parseInt(IO.readln("dame tu numero de dos cifras: "));
        
        IO.println("----------------------------");

        decenas = numero / 10;
        unidades = numero % 10;
        
        resultado = decenas + (unidades * 10);

        IO.println("El numero a cambiado " + resultado);
        
}
    
}
