package ejercicio303;

import java.util.ArrayList;

public class Barrio {

	private String nombre;
	private ArrayList<Propiedad> propiedades;
	
	
	
	public Barrio(String nombre) {
		this.nombre = nombre;
		this.propiedades = new ArrayList<Propiedad>();
	}

	public String mostrarPropiedades() {
		String msge = "Propiedades en el barrio: " + this.nombre + ": \n";
		int index = 0;
		
		for (Propiedad propiedad : propiedades) {
			msge += "P"+index + ": " + propiedad.toString() + "\n";
			index++;
		}
		
		return msge;
	}
	
	public String mostrarPropiedades(TipoPropiedad tipo) {
		String msge = "Propiedades en el barrio: " + this.nombre + ": \n";
		int index = 0;
		
		for (Propiedad propiedad : propiedades) {
			if(propiedad.getTipo() == tipo) {
				msge += "P"+index + ": " + propiedad.toString() + "\n";
				index++;				
			}
		}
		
		return msge;
	}
	
	public boolean borrarPropiedad(String domicilio) {
		Propiedad p = this.buscarPropiedad(domicilio);
		if(p != null) {
			this.propiedades.remove(p);
			return true;
		} else return false;
	}
	
	private Propiedad buscarPropiedad(String propiedad) {
		Propiedad propRef = null;
		int index = 0;
		while(propRef == null && propiedades.size() > index) {			
			propRef = propiedades.get(index).getDomicilio().equals(propiedad) ? propiedades.get(index) : null;
			index++;
		}
		
		return propRef;
	}
	
	public void agregarPropiedad(Propiedad prop) {
		boolean existeProp = this.buscarPropiedad(prop.getDomicilio()) != null;
		if(!existeProp) {
			this.propiedades.add(prop);			
		}
	}
}
