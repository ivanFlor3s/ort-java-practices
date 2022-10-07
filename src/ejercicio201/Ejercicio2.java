package ejercicio201;

import Test.HelloWord.MyHelper;

public class Ejercicio2 {
	
	
	
	public static void main(String[] args) {
		//INSTANCIO UNA PERSONA
		Persona p = new Persona();
		
		MyHelper h = new MyHelper();
		
		p.ponerNombre("Julio");
		p.ponerApellido("Strasera");
		
		h.print(p.obtenerNombreCompleto());
		
		Persona p2= new Persona();
		
		p2.ponerNombre("Dieguito");
		p2.ponerApellido("Marodano");
		h.print(p2.obtenerNombreCompleto());
		
		
		
		
	}
	
	//El uml te lo debo
}
