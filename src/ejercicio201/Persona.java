package ejercicio201;

public class Persona {
	private String nombre;
	private String apellido;
	
	public Persona() {
		this.nombre = "";
		this.apellido = "";
	}
	
	public void ponerNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public void ponerApellido(String unApellid) {
		this.apellido= unApellid;
	}
	
	public String obtenerNombreCompleto() {
		return this.apellido +  "," + this.nombre;
	}
}
