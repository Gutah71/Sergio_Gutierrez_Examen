package ejercicios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Vector;

import org.junit.Before;
import org.junit.Test;


/*añade los imports necesarios */

public class Vector2DTest2 {
	private Vector2D v1;
	private Vector2D v2;
	private Vector2D v3;
	/*
	Declaracion de vectores v1, v2,v3;
	*/
	
	/*
	 * Con @Before puedo crear un método setUp() que lance una excepción y en la cual instanciamos
	 * Los vectores v1 (-2,4), v2 (1,2) y v3 (2,1) Los vectores v1 y v3 sin ortogonales por 
	 * Lo que su producto escalar es 0 Que es lo que vamos a comprobar más adelante.
	 * 
	 */
	
	@Before
	 public void setUp() {
         v1 = new Vector2D(-2, 4); 
         v2 = new Vector2D(1, 2); 
         v3 = new Vector2D(2, 1); 
    }
	
	@Test
	public void testDotProduct() {
		/*
		 * Con assertEquals vamos a realizar unas pruebas unitarias del producto escalar que hemos 
		 * programado con anterioridad. Para ellos vamos acomprobar que el producto  de v1 por v3
		 * es 0 y que  el producto de v1 por v3 es....
		 */
		int expected=0;
		int resultado=v1.dotProduct(v3);
		assertEquals(expected, resultado);
		
		int esperado=6;
		int res=v1.dotProduct(v2);
		assertEquals(esperado, res);
	}
	
	@Test
	public void testOrthogonality() {
		/*
		 * Aqui vamos a comprobar que para los mismos vectores, que el método isOrtoghonalTo 
		 * se verifica para los vectores v1 y v3 y para el v2 y v3. Esta vez debes
		 * comprobar con los métodos AssertTrue y AssertFalse con los que convenga...
		 *  
		 */
		assertTrue(v1.isOrthogonalTo(v3));
		assertFalse(v1.isOrthogonalTo(v2));
	}
}
