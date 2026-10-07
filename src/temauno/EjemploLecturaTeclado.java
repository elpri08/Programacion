package TemaUno;

import java.util.Scanner;

public class EjemploLecturaTeclado {
    public static void main(String[] args) {
        
        String nombre, apellidos, direccion;
        String numTelefono, codigoPostal;
        int edad;

        Scanner sc = new Scanner(System.in);

        IO.println("Dime tu nombre: ");
        nombre = sc.nextLine();

        IO.println("Dime tus apellidos: ");
        apellidos = sc.nextLine();

        IO.println("Dime tu direccion: ");
        direccion = sc.nextLine();

        IO.println("Dime tu edad: ");
        edad = Integer.parseInt(sc.nextLine());
        //sc.nextInt();
        //sc.nextLine(): Arreglar que nextINT no coge el salto de linea por el nextLine

        IO.println("Dime tu número de telefono: ");
        numTelefono = sc.nextLine();
        IO.println("Dime tu codigo postal: ");
        codigoPostal = sc.nextLine();

        IO.println("----------------------");

        IO.println("Nombre:" + nombre);
        IO.println("Apellidos:" + apellidos);
        IO.println("Dirección:" + direccion);
        IO.println("Edad" + edad);
        IO.println("Número de teléfono:" + nombre);
        IO.println("Código postal:" + codigoPostal);

    }
    
}
