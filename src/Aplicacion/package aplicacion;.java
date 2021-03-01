package aplicacion;

import mates.Matematicas;

public class Principal {

    public static void main(String[] args) {
        long numeroIntentos = Long.parseLong(args[0]);
        System.out.print("Pi es: " + Matematicas.calcularPi(numeroIntentos));
    }
}