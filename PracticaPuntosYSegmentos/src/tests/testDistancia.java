package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import clases.Segmento;
import clases.Punto;
class testDistancia {

	@Test
	void testPostivos() {
		Punto p1 = new Punto(1,1);
		Punto p2 = new Punto(2,2);
		Segmento s1 = new Segmento(p1,p2);

		int distanciaObtenida=s1.distancia();
		int distanciaEsperada=0;
		assertEquals(distanciaEsperada, distanciaObtenida);
		}
		


	void testNegativos() {
		Punto p1 = new Punto(-1,-1);
		Punto p2 = new Punto(-2,-2);
		
		Segmento s1 = new Segmento(p1,p2);
	
		int distanciaObtenida=s1.distancia();
		int distanciaEsperada=0;
		assertEquals(distanciaEsperada, distanciaObtenida);
		}
	
	void testPositivosNegativos() {
		Punto p1 = new Punto(3,3);
		Punto p2 = new Punto(-3,-3);
		
		Segmento s1 = new Segmento(p1,p2);
	
		int distanciaObtenida=s1.distancia();
		int distanciaEsperada=8;
		assertEquals(distanciaEsperada, distanciaObtenida);
		}
	
	void testIguales() {
		Punto p1 = new Punto(4,4);
		Punto p2 = new Punto(4,4);
		
		Segmento s1 = new Segmento(p1,p2);
	
		int distanciaObtenida=s1.distancia();
		int distanciaEsperada=0;
		assertEquals(distanciaEsperada, distanciaObtenida);
		}
	
	}


