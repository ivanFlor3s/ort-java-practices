package ejercicio302;

public class Empleado {
	private String nombre;
	private String apellido;
	
		
	public Empleado(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}


	public String obtenerNombre(){
		return nombre + " " + apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Devuelve true si se trata del mismo empleado
	 * @param emp
	 * @return
	 */
	public boolean compararEmpleado(Empleado emp) {
		return emp.getNombre().equals(this.nombre) && emp.getApellido().equals(this.apellido);
	}
}
