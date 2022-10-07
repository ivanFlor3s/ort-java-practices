package ejercicio201;

import Test.HelloWord.MyHelper;

public class SuperHeroe {

	static final int LIMITE= 100;
	
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superPoderes;
	
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int getFuerza() {
		return fuerza;
	}
	private void setFuerza(int fuerza) {
		this.fuerza = fuerza >= LIMITE ? LIMITE : fuerza;
	}
	
	
	public int getResistencia() {
		return resistencia;
	}
	private void setResistencia(int resistencia) {
		this.resistencia = resistencia >= LIMITE ? LIMITE : resistencia;
	}
	
	
	public int getSuperPoderes() {
		return superPoderes;
	}
	private void setSuperPoderes(int superPoderes) {
		this.superPoderes = superPoderes >= LIMITE ? LIMITE : superPoderes;
	}
	
	public SuperHeroe(String nombre, int fuerza, int resistencia, int superPoderes) {
		this.nombre = nombre;
		this.setFuerza(fuerza);
		this.setResistencia(resistencia);
		this.setSuperPoderes(superPoderes);
	}
	
	public String toString(){
		return "Nombre: " + this.nombre +
		", Resistencia: " + this.resistencia +
		", Fuerza: "+ this.fuerza + 
		", Poder: " + this.superPoderes;
	}
	
	public String competir(SuperHeroe h) {
		
		boolean superaFuerza = this.fuerza > h.fuerza;
		boolean superaResist = this.resistencia> h.resistencia;
		boolean superaSuperpoder = this.superPoderes > h.superPoderes;
		
		int acumulador = 0;
		
		acumulador += superaFuerza ? 1 : 0;
		acumulador += superaResist ? 1 : 0;
		acumulador += superaSuperpoder ? 1 : 0;
		
		if(acumulador >= 2) {
			return "TRIUNFO";
		} else {
			return "DERROTA";
		}
		
	}
	
	
	
	
	

}
