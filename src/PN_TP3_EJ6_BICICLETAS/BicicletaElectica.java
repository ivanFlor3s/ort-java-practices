package PN_TP3_EJ6_BICICLETAS;

public class BicicletaElectica extends Bicicleta {
	private int wattsPotencia;

	public BicicletaElectica(String marca, int modelo, int kilometros, int unosWatts) {
		super(marca, modelo, kilometros);
		wattsPotencia = unosWatts;	
	}
	
	private boolean tieneMenosDeWatts(int watts) {
		return wattsPotencia < watts;
	}
	
	@Override
	public boolean puedeRecibirServicio(int kms, int watts) {
		return tieneMenosDeWatts(watts);
	}
}
