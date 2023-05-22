package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;

public abstract class Transporte {
	
	protected ArrayList<Paquete> paquetes = new ArrayList<Paquete>();
	
	
	public Integer getCantidadPaquetes() {
		return this.paquetes.size();
	}
	
	public Boolean agregarPaquete(Paquete paquete, String destino) {
			
			if(!destinoCompatible(destino)) {
				return false;
			}
			if(!cantidadPaquetesCompatibles()) {
				return false;
			}
			if(!pesoPaqueteCompatible(paquete)) {
				return false;
			}
			if(volumenPaqueteCompatible(paquete)) {
				return cargarPaquete(paquete);
			}
			return false;
			
		}

	protected abstract Boolean pesoPaqueteCompatible(Paquete paquete);

	protected abstract Boolean cargarPaquete(Paquete paquete);

	protected abstract Boolean volumenPaqueteCompatible(Paquete paquete);

	protected abstract Boolean cantidadPaquetesCompatibles();

	protected abstract Boolean destinoCompatible(String destino);
}
