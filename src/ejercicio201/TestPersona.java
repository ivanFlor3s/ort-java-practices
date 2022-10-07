package ejercicio201;

import Test.HelloWord.MyHelper;

public class TestPersona {

	public static void main(String[] args) {
		
		MyHelper h = new MyHelper();
		
		Persona homero = new Persona();
		homero.ponerApellido("Simpson");
		homero.ponerNombre("Homero");
		homero.ponerDomicilio(new Domicilio("Siempre viva", 123));
		h.print(homero.decirDondeVive());
		
		
		Persona p1 = new Persona();
		p1.ponerApellido("Perez");
		p1.ponerNombre("raul");
		
		h.print(p1.decirDondeVive());
		
	}

}
