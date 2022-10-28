package practica_parcial_01;

import java.util.ArrayList;

import Test.HelloWord.MyHelper;

public class KartingRace {
	private ArrayList<Carting> kartings;
	private ArrayList<Persona> colaPersonas;
	
	
	public int ubicarPersonas() {
		int personasEnCola = this.colaPersonas.size();
		if (personasEnCola >= 2) {
			ArrayList<Carting> autosOperativos =  this.getCartingsOperativos();
			for (Carting carting : autosOperativos) {
				Persona siguienteEnCola = this.tomarPrimerPersonaCola();
				siguienteEnCola.montarCarting(carting);
			}
			return autosOperativos.size();
		}
		return 0;
	}

	public ResultadoAnotar anotarPersona(String nombre, String apellido, int edad) {
		
		ResultadoAnotar result;
		
		if(nombre.isEmpty() || apellido.isEmpty()) {
			result = ResultadoAnotar.NOMBRE_INVALIDO;
		}
		
		if(edad < 12 || edad > 65) {
			result = ResultadoAnotar.EDAD_INVALIDA;
		}
		
		Persona personaEnCola = this.buscarPersonaEnCola(nombre,apellido);
		if(personaEnCola != null) {
			
			this.colaPersonas.add(new Persona(nombre, apellido, edad));
			result = ResultadoAnotar.ANOTADA_OK;
		}
		else {
			result = ResultadoAnotar.YA_ESTA_ANOTADA;
		}
		
		return result;
		
	}
	
	public KartingRace(int cantKartings) {
		this.kartings = new ArrayList<Carting>();
		this.colaPersonas = new ArrayList<Persona>();
		
		for (int i = 0; i < cantKartings; i++) {
			this.kartings.add(new Carting(i));
		}
		
	}
	
	private Persona buscarPersonaEnCola(String nombre, String apellido) {
		
		Persona aux = null;
		int index = 0;
		while(aux == null || index < this.colaPersonas.size()) {
			aux = this.colaPersonas.get(index);
			if(!aux.selfValidation(nombre, apellido)) {
				aux = null;
			}
			index++;
		}
		return aux;
	}
	
	private ArrayList<Carting> getCartingsOperativos() {
		
		ArrayList<Carting> cars = new ArrayList<Carting>();
		
		for (Carting carting : kartings) {
			if(carting.isEstaOperativo()) cars.add(carting);
		}
		return cars;
	}
	
	
	
	private Persona tomarPrimerPersonaCola() {
		return this.colaPersonas.remove(0);
	}
	
	public boolean cambiarEstado(int idCarting) {
		Carting cBuscado = this.buscarCartig(idCarting);
		if(cBuscado != null) {
			cBuscado.cambiarEstado();
			return true;
		}else return false;
		
	}
	
	private Carting buscarCartig(int idCarting) {
		Carting aux = null;
		int index = 0;
		while(aux == null || index < this.kartings.size()) {
			aux = this.kartings.get(index);
			if(aux.getIdCarting() != idCarting) {
				aux = null;
			}
			index++;
		}
		return aux;
	}
	 
	public void mostrarRecaudacion() {
		MyHelper h = new MyHelper();
		
		h.print("Lidtado de recaudacion por auto: ");
			
		double acumulador = 0;
		for (Carting carting : kartings) {
			carting.mostrarCarting();
			acumulador += carting.getRecaudado();
		}
		
		h.print("El total recaudado fue $" + acumulador);
		
		
	}
	
	

}
