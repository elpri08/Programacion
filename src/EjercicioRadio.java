public class EjercicioRadio {
    public static void main(String[] args) {
        double RadioBalonF = 11.0;
        double RadioBalonB = 12.0;
        double VolumenBalonF = 0.0;
        double VolumenBalonB = 0.0;
        double VolumenMayor = 0.0;

        VolumenBalonF = (4.0 / 3.0) * Math.PI * Math.pow( RadioBalonF, 3);
        VolumenBalonB = (4.0 / 3.0) * Math.PI * Math.pow( RadioBalonB, 3);
        VolumenMayor = Math.max (VolumenBalonB, VolumenBalonF);

        IO.println("El volumen del balon de futbol es " + VolumenBalonF);
        IO.println("El volumen del balon de baloncesto es " + VolumenBalonB);
        IO.println("El volumen mayor es del balon " + VolumenMayor);

    }
    
}
