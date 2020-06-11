/**
 * 
 */
package demCI;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Mateo
 *
 */
class OperationsTest {

	@Test
	void testSuma() {
		assertEquals(12, Operations.suma(10, 2));
	}

	@Test
	void testResta() {
		assertEquals(5, Operations.resta(8, 3));
	}

	@Test
	void testProducto() {
		assertEquals(60, Operations.producto(5, 5));
	}

	@Test
	void testCambiarSigno() {
		assertEquals(-6, Operations.cambiarSigno(6));
	}
	
	@Test
	void testRaiz() {
		assertEquals(8, Operations.raiz(4));
	}

}
