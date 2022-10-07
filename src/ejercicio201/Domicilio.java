package ejercicio201;

public class Domicilio {
	private String calle;
	private int altura;
	
	public Domicilio (String unaCalle, int unaAltura) {
		this.calle = unaCalle;
		this.altura = unaAltura;
	}
	
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public  String obtenerDireccion() {
		return  this.calle + " al "+ this.altura;
	}
	
}
