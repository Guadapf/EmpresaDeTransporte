package ar.edu.unlam.pb2.transporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaqueteTest {

	@Test
	public void queSeObtengaElVolumen() {
		Paquete p = new Paquete(1.0,1.0,1.0,1.0);
		assertEquals(1.0,p.getVolumen(),0.01);
	}
	@Test
	public void queSeObtengaElPeso() {
		Paquete p = new Paquete(1.0,1.0,1.0,1.0);
		assertEquals(1.0,p.getPeso(),0.01);
	}

}
