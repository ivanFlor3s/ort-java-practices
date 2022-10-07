package ejercicio201;

public class Persona {
	private String nombre;
	private String apellido;
	
	private Domicilio viveEn;
	
	public Persona() {
		this.nombre = "";
		this.apellido = "";
		this.viveEn = null;
	}
	
	public void ponerNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public void ponerDomicilio(Domicilio unDom) {
		this.viveEn = unDom;
	}
	
	public String decirDondeVive() {
		if(this.viveEn != null) {
			return this.obtenerNombreCompleto() + ": Hola, vivo en: " + this.viveEn.obtenerDireccion();			
		} else {
			return  this.obtenerNombreCompleto() + ":No tengo domicilio";
		}
	}
	
	public void ponerApellido(String unApellid) {
		this.apellido= unApellid;
	}
	
	public String obtenerNombreCompleto() {
		return this.apellido +  "," + this.nombre;
	}
}
