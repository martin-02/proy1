/*
    Copyright [2021] [Martin Berlanas Molera]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

package mates;

import java.util.Random;

public class Matematicas {

    /*
    * Genera una aproximación al número pi mediante el método de Montecarlo.
    * El parámetro ‘pasos‘ indica el número de puntos generado.
    */

    public static double calcularPi(long numeroIntentos) {

        //Definimos las variables numericas de tipo "int" y "long".
        long pi;
        int total = 0;
        int dentroCirculo = 0;

        //Método que genera una serie de números aleatorios para calcular el número Pi mediante MonteCarlo.
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

	//Calculamos la aproximación a Pi mediante los métodos anteriores y devuelve el resultado (el cual se va actualizando)
        pi = (long) (16 * ((double) dentroCirculo / (double) total));
        return pi;
    }
}