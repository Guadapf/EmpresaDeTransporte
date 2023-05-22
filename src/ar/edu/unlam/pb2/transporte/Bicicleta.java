package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;

public class Bicicleta extends Transporte{
	
	private String destino;


	protected Boolean cargarPaquete(Paquete paquete) {
		return paquetes.add(paquete);
	}

	protected Boolean pesoPaqueteCompatible(Paquete paquete) {
		return paquete.getPeso()<=15;
	}
	protected Boolean volumenPaqueteCompatible(Paquete paquete) {
		return (paquete.getVolumen()<= 0.125);
	}
	protected Boolean cantidadPaquetesCompatibles() {
		return this.paquetes.size()<2;
	}
	protected Boolean destinoCompatible(String destino) {
		if(this.destino == null) {
			this.destino = destino;
		}
		return this.destino.equals(destino);
	}

	

}
