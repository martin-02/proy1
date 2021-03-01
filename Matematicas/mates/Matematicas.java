package mates;

import java.util.Random;

public class Matematicas {

    /**
    * Genera una aproximación al número pi mediante el método de Montecarlo.
    * El parámetro ‘pasos‘ indica el número de puntos generado.
    */

    public static double calcularPi(long numeroIntentos) {

        long pi; //Usamos un long porque queremos que muestre los decimales
        int total = 0;
        int dentroCirculo = 0;

        double r = 0.5;
        Random rand = new Random();
        for (int i = 0; i < numeroIntentos; i++) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();

            double lado = (x * x) + (y * y);
            if (lado < (r * r)) {
                dentroCirculo++;
            }

            total++;
        }
            
        pi = (long) (16 * ((double) dentroCirculo / (double) total));
        return pi;
    }
}