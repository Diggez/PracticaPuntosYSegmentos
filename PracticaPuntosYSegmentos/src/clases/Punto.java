package clases;

public class Punto {

	private int x;
	private int y;
	
	/**
	 *Crea un Punto en la posicion (0,0)
	 */
	public Punto () {
		this.x=0;
		this.y=0;
	}
	/**
	 * Crea un Punto en una posicion concreta
	 * @param x
	 * @param y
	 */
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
	return this.x;	
	}
	
	public int getY() {
	return this.y;
	}
	
	public void setX(int nX) {
		this.x=nX;
	}
	
	public void setY(int nY) {
		this.y=nY;
	}
	
	@Override
	
	public String toString() {
		String mensaje="("+this.x+","+this.y+")";
	return mensaje;
	}
}