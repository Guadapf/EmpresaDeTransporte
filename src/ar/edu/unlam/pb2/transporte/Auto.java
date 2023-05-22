package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;
import java.util.HashSet;

public class Auto extends Transporte{

	private HashSet<String> destinos = new HashSet<String>();
	private Double pesoCargado = 0.0;
	private Double volumenCargado = 0.0;

	

	protected Boolean cargarPaquete(Paquete paquete) {
		volumenCargado += paquete.getVolumen();
		pesoCargado += paquete.getPeso();
		return paquetes.add(paquete);
	}
	
	protected Boolean pesoPaqueteCompatible(Paquete paquete) {
		return paquete.getPeso()<=500;
	}
	protected Boolean volumenPaqueteCompatible(Paquete paquete) {
		return paquete.getVolumen()<= 2;
	}
	protected Boolean cantidadPaquetesCompatibles() {
		return true;
	}
	protected Boolean destinoCompatible(String destino) {
		if(this.destinos.contains(destino) || (this.destinos.size()<3) && !this.destinos.contains(destino)) {
			this.destinos.add(destino);
		}else {
			return false;
		}
		return true;
	}


}
