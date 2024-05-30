package ejercicios;

/**
 * La clase Vector2D proporciona metodos para crear objetos Vector2D a partir de objetos Point
 * <p>
 * Esta clase incluye metodos para crear nuevos vectores y metodos booleano para saber si es ortogonal.
 * </p>
 * 
 * @author Sergio
 * @version 1.0
 */

public class Vector2D {
	public Integer x, y;
	
	 /**
     * Constructor de la clase Vector2D.
     *
     * @param x Corresponde al parametro Integer x de Vector2D.
     * @param y Corresponde al parametro Integer y de Vector2D.
     */
	
	Vector2D(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	  /**
     * Constructor de la clase Vector2D.
     *
     * @param p1 El primer objeto Point.
     * @param p2 El segundo objeto Point.
     */

	Vector2D(Point p1, Point p2) {
		this.x = p2.x - p1.x;
		this.y = p2.y - p1.y;
	}
	
	/**
     *  Calcula el producto escalar entre un objeto Vector2D establecido y que se introduce.
     *
     * @param v El objeto Vector2D.
     * @return Un numero que corresponde al producto escalar de dos vectores.
     * @see <a href="https://www.superprof.es/apuntes/escolar/matematicas/analitica/vectores/producto-escalar-2.html">https://www.superprof.es/apuntes/escolar/matematicas/analitica/vectores/producto-escalar-2.html</a>
     */
	
	public int dotProduct(Vector2D v) {
		return (x * v.x) + (y * v.y);
	}
	
	/**
     *  Calcula si es ortogonal a traves del producto escalar.
     *
     * @param v El objeto Vector2D.
     * @return Devuelve un atributo boolean True o False dependiendo si es octogonal.
     */
	
	public boolean isOrthogonalTo(Vector2D v) {
		return (dotProduct(v) == 0);
	}
	
}
