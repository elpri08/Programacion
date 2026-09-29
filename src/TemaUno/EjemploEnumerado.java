package TemaUno;

public class EjemploEnumerado {
    public static void main(String[] args) {
        
        //Un tipo enumerado es un conjunto de constantes fijo
        enum Asignaturas {
            PROGRAMACION, SISTEMASINFORMATICOS, BASESDEDATOS,LENGUAJESDEMARCAS,ENTORNOSDEDASARROLLO

        }

        Asignaturas miPreferida = Asignaturas.BASESDEDATOS;

        IO.println(Asignaturas.PROGRAMACION);
        IO.println("Mi asignatura preferida es " +  miPreferida);

    }
    
}
