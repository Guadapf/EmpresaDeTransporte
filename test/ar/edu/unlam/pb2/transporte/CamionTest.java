package ar.edu.unlam.pb2.transporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class CamionTest {

	@Test
	public void queSePuedaCargarUnPaquete() {
		Camion cam = new Camion();
		Paquete p1 = new Paquete(0.1,0.1,0.1,1.0);
		
		assertTrue(cam.agregarPaquete(p1, "Moron"));
	}
	
	@Test
	public void queNoSePuedaCargarPaqueteConPesoExcedido() {
		Camion cam = new Camion();
		Paquete p1 = new Paquete(0.1,0.1,0.1,16001.0);
		
		assertFalse(cam.agregarPaquete(p1, "Moron"));
	}
	
	@Test
	public void queCargandoVariosPaquetesNoSePuedaCargarSiExcedeElPeso() {
		Camion cam = new Camion();
		Paquete p1 = new Paquete(0.1,0.1,0.1,10000.0);
		Paquete p2 = new Paquete(0.1,0.1,0.1,2000.0);
		Paquete p3 = new Paquete(0.1,0.1,0.1,2000.0);
		Paquete p4 = new Paquete(0.1,0.1,0.1,1500.0);
		Paquete p5 = new Paquete(0.1,0.1,0.1,1500.0);
		
		assertTrue(cam.agregarPaquete(p1, "Moron"));
		assertTrue(cam.agregarPaquete(p2, "Moron"));
		assertTrue(cam.agregarPaquete(p3, "Moron"));
		assertTrue(cam.agregarPaquete(p4, "Moron"));
		assertFalse(cam.agregarPaquete(p5, "Moron"));
	}
	
	@Test
	public void queNoSePuedaCargarPaqueteConVolumenExcedido() {
		Camion cam = new Camion();
		Paquete p1 = new Paquete(10.1,0.1,20.1,1.0);
		
		assertFalse(cam.agregarPaquete(p1, "Moron"));
	}
	
	

}
