package ejercicio302;

import Test.HelloWord.MyHelper;

public class TestCompania {

	public static void main(String[] args) {
		MyHelper h = new MyHelper();
		
		Empleado emp1 = new Empleado("Josesito", "Rosas");
		Empleado emp2 = new Empleado("Kino", "Ramires");
		
		//h.print(emp1.obtenerNombre());
		
		Oficina of1 = new Oficina(1,"los peques");
		of1.agregarEmpleado(emp2);
		of1.agregarEmpleado(emp1);
		
		h.print(of1.informarNombreEmpleados());
		
		h.asesinarScanner();

	}

}
