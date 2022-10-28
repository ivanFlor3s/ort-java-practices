package practica_parcial_01;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apelldo, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apelldo;
		this.edad = edad;
	}
	
	public boolean selfValidation(String nom, String ap) {
		return this.apellido.equals(ap) && this.nombre.equals(nom);
	}
	
	public boolean esMenor() {
		return this.edad < 18;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}
	
	
	public void montarCarting(Carting carting) {
		carting.seSube(this);
	}
	
	

}
