package PN_TP3_EJ6_BICICLETAS;
import java.util.ArrayList;

public class Taller {
	private String nombre;
	private int maxBicicletaKms;
	private int maxBicicletasWatts;
	
	public Taller(String unNombre, int unaCantDeKms, int unaCantWatts) {
		nombre = unNombre;
		maxBicicletaKms= unaCantDeKms;
		maxBicicletasWatts = unaCantWatts;
	}
	
	public int cantServiciosPosibles(ArrayList<Bicicleta> bicicletas) {
		int contador = 0;
		for (Bicicleta bicicleta : bicicletas) {
			boolean puedeHacerService = bicicleta.puedeRecibirServicio(maxBicicletaKms ,maxBicicletasWatts);
			if (puedeHacerService) {
				contador++;
			}
		}
		return contador;
	}
}
