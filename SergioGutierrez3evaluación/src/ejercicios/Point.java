package ejercicios;

/**
 * La clase Point proporciona metodos para crear objetos Point
 * <p>
 * Esta clase incluye metodos para sumar puntos.
 * </p>
 * 
 * @author Sergio
 * @version 1.0
 */

public class Point {
	public Integer x, y;
	
	
	  /**
     * Constructor de la clase Point.
     *
     * @param x El primer numero.
     * @param y El segundo numero.
     */
	
	Point(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	/**
     * Aniade (suma) los valores x e y del Point a los que estaban establecidos.
     *
     * @param p El objeto Point.
     * @return Un nuevo objeto Point con los valores sumados.
     */
	
	public Point add(Point p) {
		return new Point(x + p.x, y + p.y);
	}
	
	
	/**
     * Resta los valores x e y del Point a los que estaban establecidos.
     *
     * @param p El objeto Point.
     * @return Un nuevo objeto Point con los valores restados.
     */
	
	public Point sub(Point p) {
		return new Point(x - p.x, y - p.y);
	}
}
