public class Ejercicio1 {
    public static void main(String[] args) {
        /*
            La nota de programación de la primera evaluación se calcula:
            - 30% una prueba de clase a mitad de trimestre
            - 30% un exámen al final de la evaluación
            - 25% de prácticas de clase
            - 15% evaluación formativa: participación en clase, lo bien que le caes al profesor, etc.

            Pide cada nota por teclado y muestra la nota final del trimestre
        */
        double notaPrueba, examen, practicas, evaluacion, notafinal;

        notaPrueba = Double.parseDouble(IO.readln("Dime tu nota de la prueba: "));
        examen = Double.parseDouble(IO.readln("Dime tu nota del examen: "));
        practicas = Double.parseDouble(IO.readln("Dime tu nota de las practicas: "));
        evaluacion = Double.parseDouble(IO.readln("Dime tu nota de la evaluacion: "));   

        IO.println("--------------------------------");
    
        IO.println("Tu nota de prueba es: " + notaPrueba);
        notaPrueba = notaPrueba * 0.30;

        IO.println("Tu nota de examen es: " + examen);
        examen = examen * 0.30;
        
        IO.println("Tu nota de practicas es:" + practicas);
        practicas = practicas * 0.25;
        
        IO.println("Tu nota de evaluacion es: " + evaluacion);
        evaluacion = evaluacion * 0.15;

        notafinal = notaPrueba + examen + practicas + evaluacion;
        IO.println("Tu nota final es: " + notafinal);
    }

}