package ejercicio303;

public class Propiedad {
	private String domicilio;
	private int precio;
	private TipoPropiedad tipo;
	
	public Propiedad(String domicilio, int precio, TipoPropiedad tipo) {
		this.domicilio = domicilio;
		this.precio = precio;
		this.tipo = tipo;
	}


	public String toString() {
		return "Propiedad [domicilio=" + domicilio + ", precio=" + precio + ", tipo=" + tipo + "]";
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public TipoPropiedad getTipo() {
		return tipo;
	}


	public void setTipo(TipoPropiedad tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
}
