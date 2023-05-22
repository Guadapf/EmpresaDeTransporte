package ar.edu.unlam.pb2.transporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class BicicletaTest {

	@Test
	public void queSePuedaCargarPaquetePequenio() {
		Bicicleta bici = new Bicicleta();
		Paquete p1 = new Paquete(0.1,0.1,0.1,1.0);
		assertTrue(bici.agregarPaquete(p1, "Moron"));
	}
	
	@Test
	public void queNoSePuedaSuperarElLimiteDePaquetes() {
		Bicicleta bici = new Bicicleta();
		Integer valorEsperado = 2;
		Paquete p1 = new Paquete(0.1,0.1,0.1,1.0);
		Paquete p2 = new Paquete(0.1,0.1,0.1,1.0);
		Paquete p3 = new Paquete(0.1,0.1,0.1,1.0);
		assertTrue(bici.agregarPaquete(p1, "Moron"));
		assertTrue(bici.agregarPaquete(p2, "Moron"));
		assertFalse(bici.agregarPaquete(p3, "Moron"));
		assertEquals(valorEsperado,bici.getCantidadPaquetes());
	}
	
	@Test
	public void queNoSePuedaCargarVolumenExcedido() {
		Bicicleta bici = new Bicicleta();
		Integer valorEsperado = 2;
		Paquete p1 = new Paquete(0.51,0.5,0.5,1.0);
		assertFalse(bici.agregarPaquete(p1, "Moron"));
	}
	
	@Test
	public void queNoSePuedaCargarConPesoExcedido() {
		Bicicleta bici = new Bicicleta();
		Integer valorEsperado = 2;
		Paquete p1 = new Paquete(0.5,0.5,0.5,15.1);
		assertFalse(bici.agregarPaquete(p1, "Moron"));
	}
	
	@Test
	public void queNoSePuedaCargarDestinosDistintos() {
		Bicicleta bici = new Bicicleta();
		Integer valorEsperado = 2;
		Paquete p1 = new Paquete(0.1,0.1,0.1,0.1);
		Paquete p2 = new Paquete(0.1,0.1,0.1,0.1);
		assertTrue(bici.agregarPaquete(p1, "Moron"));
		assertFalse(bici.agregarPaquete(p2, "Canuelas"));
	}

}
