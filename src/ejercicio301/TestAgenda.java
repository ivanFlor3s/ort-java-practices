package ejercicio301;

import Test.HelloWord.MyHelper;
import ejercicio201.Domicilio;
import ejercicio201.Persona;

public class TestAgenda {
	
	public static void main(String[] args) {
		
		MyHelper h = new MyHelper();
		Agenda agenda = new Agenda();
		
		Persona p1 = 
			new Persona("Raul","Gomez",new Domicilio("calle falsa", 123),"9899898");
		
		
		Persona p2 = 
				new Persona("Juansito","Perez",new Domicilio("calle verdadera", 321),"11111111"); 
	
		agenda.agregarPersona(p2);
		agenda.agregarPersona(p1);
		
		h.print(agenda.toString());
		
		h.print("Quito a la p1");
		agenda.removerPersona(p1);
		h.print(agenda.toString());
		
		//Vuelvo a agregar la p1
		h.print("Vuelvo a agrgar a la p2");
		agenda.agregarPersona(p2);
		h.print(agenda.toString());
	}

}
