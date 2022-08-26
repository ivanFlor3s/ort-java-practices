package Test.HelloWord;

public class ejercicio27 {

	static final int CANT_EDADES = 5;
	static final int EDAD_MAYOR = 18;
	
	public static void main(String[] args) {
	
		MyHelper helper = new MyHelper();
		int auxEdad;
		int acumuladorEdades = 0;
		int acumMayoresImpares = 0;
		
		for (int i = 0; i < CANT_EDADES; i++) {
			
			do {
				auxEdad = helper.printAndAskForNumber("Ingrese una edad " + (i+1));
			} while (auxEdad < 0);
			
			acumuladorEdades += auxEdad;
			if(auxEdad > EDAD_MAYOR && helper.esImpar(auxEdad) ) {
				acumMayoresImpares++;
			}
		}
		
		helper.print("El promedio entre las " + CANT_EDADES + " edades es: " + ((double)acumuladorEdades / CANT_EDADES));
		helper.print("Se ingresaron " + acumMayoresImpares + " edades mayor a " + EDAD_MAYOR + " e impares");
		
		helper.asesinarScanner();

	}

}
