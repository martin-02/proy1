package Aplicacion;

import mates.Matematicas;

/*
 * Esta clase implementa al método Principal.
 * El argumento "args[0] indica el número de lanzamientos que el programa va a realizar. 
  */
public class Principal {

    public static void main(String[] args) {
        long numeroIntentos = Long.parseLong(args[0]);
        System.out.print("Pi es: " + Matematicas.calcularPi(numeroIntentos));
	}
}