package PN_TP3_EJ6_BICICLETAS;

public class Bicicleta {
	private String marca;
	private int modelo;
	private int kilometros;
	
	public Bicicleta(String marca, int modelo, int kilometros) {
		this.marca = marca;
		this.modelo = modelo;
		this.kilometros = kilometros;
	}
	
	private boolean tieneMenosDeKms(int kms) {
		return kilometros < kms;
	}
	
	public boolean puedeRecibirServicio(int kms, int watts) {
		return tieneMenosDeKms(kms);
	}
}
