package ar.edu.unlam.pb2.transporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutoTest {

	@Test
	public void queSePuedaCargarPaquetePequenio() {
		Auto auto = new Auto();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(auto.agregarPaquete(p1, "Moron"));
	}

	@Test
	public void queNoSePuedaCargarVolumenExcedido() {
		Auto auto = new Auto();
		Integer valorEsperado = 2;
		Paquete p1 = new Paquete(1.0, 1.0, 2.1, 1.0);
		assertFalse(auto.agregarPaquete(p1, "Moron"));
	}

	@Test
	public void queNoSePuedaCargarConPesoExcedido() {
		Auto auto = new Auto();
		Integer valorEsperado = 2;
		Paquete p1 = new Paquete(0.5, 0.5, 0.5, 500.1);
		assertFalse(auto.agregarPaquete(p1, "Moron"));
	}

	@Test
	public void queNoSePuedaCargarMasDeTresDestinosDistintos() {
		Auto auto = new Auto();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 0.1);
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 0.1);
		Paquete p3 = new Paquete(0.1, 0.1, 0.1, 0.1);
		Paquete p4 = new Paquete(0.1, 0.1, 0.1, 0.1);
		Paquete p5 = new Paquete(0.1, 0.1, 0.1, 0.1);
		assertTrue(auto.agregarPaquete(p1, "Moron"));
		assertTrue(auto.agregarPaquete(p2, "Canuelas"));
		assertTrue(auto.agregarPaquete(p3, "Haedo"));
		assertFalse(auto.agregarPaquete(p4, "Moreno"));
		assertTrue(auto.agregarPaquete(p5, "Moron"));
	}

}
