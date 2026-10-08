public class ejercicio4 { 
    public static void main(String[] args) {
        String nombre, descripcion, categoria;
        double precio, IVA;
        int stock;

        IO.println("--- INFORMACION DE UN PRODUCTO ---");
        nombre = IO.readln("dime el nombre: ");
        descripcion = IO.readln("dime la descripcion: ");
        precio = Double.parseDouble(IO.readln("Dime el precio: "));
        IVA = Double.parseDouble(IO.readln("Dime el IVA: "));
        categoria = IO.readln("dime la categoria: ");
        stock = Integer.parseInt(IO.readln("Dime el stock: "));

        IO.println("----------------------------");
        
        IO.println("Tu nombre es: " + nombre);
        IO.println("Tu descripcion es: " + descripcion);
        IO.println("Tu precio es: " + precio);
        IO.println("Tu IVA es: " + IVA);
        IO.println("Tu categoria es: " + categoria);
        IO.println("Tu stock es: " + stock);
}
    
}
