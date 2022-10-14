package ejercicio201;

public class Persona {
	private String nombre;
	private String apellido;
	
	private Domicilio viveEn;
	private String dni;
	
	public Persona() {
		this.nombre = "";
		this.apellido = "";
		this.viveEn = null;
	}
	
	public Persona(String nombre, String apellido, Domicilio viveEn, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.viveEn = viveEn;
		this.dni = dni;
	}

	public String getDni() {
		return this.dni;
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

	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", viveEn=" + viveEn + ", dni=" + dni + "]";
	}
}
