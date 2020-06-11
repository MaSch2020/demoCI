/**
 * 
 */
package demCI;

import java.util.List;
import java.util.Optional;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Mateo
 *
 */
public class Strings {

	/***
	 * Metodo buscarEmpiezaLetra, busca las palabras que empiezan con un string
	 * @param myList
	 * @return long num
	 */
	public static long buscarEmpiezaLetra(String a, List<String> myList) {
		return myList.stream().filter(x -> x.startsWith(a)).count();
	}
	
	/***
	 * Metodo buscarEmpiezaLetra, busca las palabras que terminan con un string
	 * @param a
	 * @param myList
	 * @return long num
	 */
	public static long buscarTerminaLetra(String a, List<String> myList) {
		return myList.stream().filter(x -> x.endsWith(a)).count();
	}
	
	/***
	 * Metodo cantidadElementos, cuenta la cantidad de elementos de una lista
	 * @param myList
	 * @return long num
	 */
	public static long cantidadElementos(List<String> myList) {
		return myList.stream().count();
	}
	
	/***
	 * Metodo primerElemento, busca el primer elemento de la lista
	 * @param myList
	 * @return String a
	 */
	public static String primerElemento(List<String> myList) {
		return myList.get(0);
	}
	
	/***
	 * Metodo ultimoElemento, busca el ultimo elemento de la lista
	 * @param myList
	 * @return String a
	 */
	public static String ultimoElemento(List<String> myList) {
		return myList.get(myList.size()-1);
	}

}
