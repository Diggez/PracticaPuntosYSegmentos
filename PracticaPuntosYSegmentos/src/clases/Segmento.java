package clases;

public class Segmento {

	private Punto a;
	private Punto b;
	
	/**
	 * Crea un Segmento de dos Punto en las posiciones 0,0 y 1,1
	 */
	public Segmento() {
		a=new Punto(0,0);
		b=new Punto(1,1);
	}
	/**
	 * Crea un Segmento de dos puntos especificos
	 * @param a
	 * @param b
	 */
	public Segmento(Punto a, Punto b) {
		
		this.a=a;
		this.b=b;
		
	}
	
	public Punto getA() {
	return a;	
	}
	public Punto getB() {
	return b;	
	}
	
	public void setA(Punto nA) {
		a=nA;
	}
	
	public void setB(Punto nB) {
		b=nB;
	}
	/**
	 * Calcular la distancia entre los dos Puntos del Segmento
	 * @return la distancia entre los dos Puntos del Segmento
	 */
	public int distancia() {
    int distancia=(int)Math.sqrt(Math.pow(a.getY()-a.getX(),2)+Math.pow(b.getY()-b.getX(),2));
	return distancia;
	}
	
	@Override
	
	public String toString() {
	String mensaje="[("+a.getX()+","+a.getY()+")"+",("+b.getX()+","+b.getY()+")]";
	return mensaje;
	}
}
