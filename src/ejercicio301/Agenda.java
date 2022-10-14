package ejercicio301;

import java.util.ArrayList;

import ejercicio201.Persona;

public class Agenda {
	
	private ArrayList<Persona> personas;

	public Agenda() {
		this.personas = new ArrayList<Persona>();
	}
	
	public Persona buscarPersona(String dni) {
		Persona p = null;
		int i = 0;
		
		while(p == null && i < this.personas.size()) {
			Persona pAux = this.personas.get(i);
			if(pAux.getDni() == dni) {
				p = pAux;
			}
			i++;
		}
		return p;
	}
	
	public boolean agregarPersona(Persona person) {
		Persona match = this.buscarPersona(person.getDni());
		if(match == null) {
			this.personas.add(person);
			return true;
		}
		else 
			return false;
	}
	
	public boolean removerPersona(Persona person) {
		Persona match = this.buscarPersona(person.getDni());
		if(match != null) {
			this.personas.remove(match);			
			return true;
		}
		else return false;
	}
	
	public String toString(){
		String msge = "";
		for (Persona persona : personas) {
			msge += persona.toString();
			msge += " \n ";
		}
		
		return msge;
	}
}
