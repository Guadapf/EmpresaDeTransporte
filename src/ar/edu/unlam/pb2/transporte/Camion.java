package ar.edu.unlam.pb2.transporte;

public class Camion extends Transporte{
	
	private Double pesoTotal = 0.0;
	private Double volumenTotal = 0.0;

	@Override
	protected Boolean pesoPaqueteCompatible(Paquete paquete) {
		return (paquete.getPeso() <= 16000);
	}

	@Override
	protected Boolean cargarPaquete(Paquete paquete) {
		
		this.pesoTotal += paquete.getPeso();
		this.volumenTotal += paquete.getVolumen();
		
		if(this.pesoTotal <= 16000 && this.volumenTotal <= 20) {
			return paquetes.add(paquete);
		}
		return false;
		
	}

	@Override
	protected Boolean volumenPaqueteCompatible(Paquete paquete) {
		return (paquete.getVolumen() <= 20);
	}

	@Override
	protected Boolean cantidadPaquetesCompatibles() {
		return true;
	}

	@Override
	protected Boolean destinoCompatible(String destino) {
		return true;
	}

	
}
