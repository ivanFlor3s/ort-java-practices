package Test.HelloWord;

public class Sueldos {
	
	private static MyHelper h = new MyHelper();
	
	static final String PALABRA_FIN = "fin"; 
	static int DIAS_MES= 30;
	
	static final int BASICO_A = 20000; 
	static final int BASICO_B = 30000;
	static final int BASICO_C = 40000;
	
	public static void main(String[] args) {
		
		int cantEmpleados = 0;
		
		String veterano = "";
		int topVeterano = 0;
		
		String ricachon = "";
		double topRicachon = 0;	
		
		
		
		String ingreso = pedirNombre();
		
		while ( !ingreso.equals(PALABRA_FIN)) {
			
			String categoria = pedirCategoria();
			int antiguedad = pedirAntiguedad();
			
			//Valido el podio de veteranos
			if(antiguedad > topVeterano) {
				topVeterano = antiguedad;
				veterano = ingreso;
			}
			
			cantEmpleados++;
			
			double sueldo = calcularSueldo(antiguedad, categoria, calcularVacaciones(antiguedad));
			

			//Valido el podio de ricachones
			if(sueldo > topRicachon) {
				topRicachon = sueldo;
				ricachon = ingreso;
			}
			
			h.print("Al empleado " + ingreso + " le corresponde un sueldo de: $" + sueldo );
			
			
			ingreso = pedirNombre();
		}
		
		h.print("cantidad de empleados total: " + cantEmpleados);
		h.print("el mas antiguo es:" + veterano);
		h.print("el que gana mas es: " + ricachon);

		h.asesinarScanner();
	}
	
	public static String pedirCategoria() {
		String categoria; 
		
		do {
			categoria = h.printAndAskForString("Ingrese la categoria (Puede ser A, B o C)")	;		
		} while ( categoria.isEmpty() || !(categoria.equals("A") || categoria.equals("B") || categoria.equals("C")) );
		
		return categoria;
	}
	
	public static String pedirNombre() {
		String msgeAskName = "Ingrese el nombre del empleado y " + PALABRA_FIN + " para terminar el programa";
		String nombre= "";
		do {
			nombre = h.printAndAskForString(msgeAskName)	;		
		} while ( nombre.isEmpty() );
		
		return nombre;
	}
	
	public static int pedirAntiguedad() {
		int antiguedad; 
		
		do {
			//Se podria validar que haya un input y no vacio, queda como TODO :(
			antiguedad = h.printAndAskForNumber("Ingrese la antiguedad (1 - 50)");		
		} while (antiguedad < 1 || antiguedad > 50 );
		
		return antiguedad;
	}
	
	public static double calcularSueldo(int ant, String cat, int diasVacaciones) {
		
		int basico = 0;
		
		switch (cat) {
		case "A":
			basico= BASICO_A;
			break;
			
		case "B":
			basico= BASICO_B;
			break;
		case "C":
			basico= BASICO_C;
			break;
		}
		
		double sueldoDiasTrabajados = ((double)basico/DIAS_MES) * (DIAS_MES - diasVacaciones) ;
		double sueldoDiasVacaciones = ((double)basico/25) * diasVacaciones;
		
		return Math.floor(sueldoDiasTrabajados + sueldoDiasVacaciones);
	}
	
	public static int calcularVacaciones(int antiguedad) {
		int diasVacaciones = 0;
		
			if(h.intBetwen(antiguedad, 0 , 5)) {
				diasVacaciones = 14;
			}
			if(h.intBetwen(antiguedad, 6, 10)) {
				diasVacaciones = 21;
			}
			if(h.intBetwen(antiguedad, 11, 50)) {
				diasVacaciones = 21;
			}
			
			return diasVacaciones;
		}

}
