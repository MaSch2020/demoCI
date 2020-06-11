package demCI;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class StringsTest {

	List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1", "xdddx");

	@Test
	void testBuscarEmpiezaLetra() {
		assertTrue(Strings.buscarEmpiezaLetra("c", myList) > 0);
	}

	@Test
	void testBuscarTerminaLetra() {
		assertTrue(Strings.buscarTerminaLetra("1", myList) > 0);
	}
	
	@Test
	void testcantidadElementos() {
		assertTrue(Strings.cantidadElementos(myList) > 0);
	}
	
	@Test
	void testPrimerElemento() {
		assertEquals("a1", Strings.primerElemento(myList));
	}
	
	@Test
	void testUltimoElemento() {
		assertEquals("xdddx", Strings.ultimoElemento(myList));
	}
	
	

}
