package ej_trenes;

public class Vagon {
	final int CARGA_S = 30;
	final int CARGA_M = 40;
	final int CARGA_L = 50;
	
	private int carga;
	private int capacidad;
	
	public boolean estaLleno() {
		return this.capacidad == this.carga;
	}
	
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Vagon(TipoVagon tipo) {
		if(tipo.equals(TipoVagon.LARGE)) {
			this.capacidad = CARGA_L;
		} else {
			if(tipo.equals(TipoVagon.MEDIUM)) {
				this.capacidad = CARGA_M;
			} else {
				this.capacidad = CARGA_S;
			}
		}
	}
	
	public int cargar(int toneladas) {
		int toneladasRestantes = toneladas;
		int disponible = this.capacidad - this.carga;
		
		//Mi vagon termina de cargar todas las toneladas
		if(disponible >= toneladas) {
			this.carga += toneladas;
			toneladasRestantes = 0;
		}
		//Mi vagon no pued terminar de cargar las toneladas
		else {
			this.carga += disponible;
			toneladasRestantes -= disponible;
		}
		return toneladasRestantes;
	}
	
}
