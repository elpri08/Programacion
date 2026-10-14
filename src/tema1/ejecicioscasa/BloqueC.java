package ejecicioscasa;

public class BloqueC { 
    public static void main(String[] args) {
    
        //c1 
        int a = 7, b = 12;
    
        a = a + 5;
        b = b - 5;
    
        IO.println("el a es: " + a);
        IO.println("el b es: " + b);

        //c2
        int tiempototal = 3725;
        int horas = 0;
        int minutos = 0;
        int segundos = 0;


        minutos = tiempototal / 60;
        horas = minutos / 60;

        minutos = minutos % 60;
        horas = horas % 60;
        tiempototal = tiempototal % 60 % 60;

        IO.println("los min son: " + horas + " horas " + minutos + " minutos " + tiempototal + " segundos ") ;
      

        //c3 
        int n = (int) (Math.random() * 20) + 1;
        IO.println("Dado: " + n);

        //c4 
          double saldo = 20000.0;
        double intereses = 0.0, retenciones = 0.0;
        double interes = 0.0275, retencion = 0.18; //2.75% y 18%
        double ganancias = 0.0;
        int meses = 0;

        meses = Integer.parseInt(IO.readln("Dime los meses que tienes el dinero: "));
        
        
        intereses = saldo * interes * (meses / 12.0);
        retenciones = intereses * retencion;
        ganancias = intereses - retenciones;

        IO.println("Intereses: " + intereses + "€");
        IO.println("Retención hacienda: " + retenciones + "€");
        IO.println("En total he ganado: " + ganancias + "€ en " + meses + " meses.");

        //c5
        double diametro = 15.5, altura = 42.4;
        double radio = diametro / 2;
        final double PI = Math.PI;

        double areaBase = 0.0, volumen = 0.0;

        areaBase = PI * Math.pow( radio, 2);
        volumen = areaBase * altura;

        IO.println("El área de la base es: " + areaBase);
        IO.println("El volumen del cilindro es: " + volumen);
}
    
}
