/**
 * 
 */
package demCI;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.IntStream;

/**
 * @author Mateo
 *
 */
public class Operations {

	/***
	 * Metodo suma, suma dos numeros recibidos
	 * 
	 * @param x
	 * @param y
	 * @return int x + y
	 */
	public static int suma(int x, int y) {
		return x + y;
	}

	/***
	 * Metodo resta, resta dos numeros
	 * 
	 * @param x
	 * @param y
	 * @return int x - y
	 */
	public static int resta(int x, int y) {
		return x - y;
	}

	/***
	 * Metodo producto, multiplica dos valores
	 * 
	 * @param x
	 * @param y
	 * @return int x*y
	 */
	public static int producto(int x, int y) {
		return IntStream.rangeClosed(x, y).reduce(0, (a, b) -> x * y);
	}

	/***
	 * Metodo cambiarSigno, cambia el signo de un numero
	 * 
	 * @param x
	 * @param y
	 * @return double -x
	 */
	public static double cambiarSigno(int x) {
		return -x;
	}

	/***
	 * Metodo raiz, calcula la raiz cuadrada de un numero
	 * 
	 * @param x
	 * @return double x
	 */
	public static double raiz(int x) {
		return Math.sqrt(x);
	}

	/***
	 * Metodo division
	 * @param x
	 * @param y
	 * @return int x
	 */
	public static int division(int x, int y) {
		return (x / y);
	}

}
