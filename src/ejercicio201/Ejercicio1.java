package ejercicio201;

import Test.HelloWord.MyHelper;

public class Ejercicio1 {
	private static MyHelper h = new MyHelper();
	
	/**
	 * sumar que recibe 2 numeros
	 * @return
	 */
	private static int sumar(){
		int numero1 = h.printAndAskForNumber("Ingrese el primer numero");
		int numero2 = h.printAndAskForNumber("Ingrese el segundo numero");
		
		return numero1 + numero2;
		
	}
	
	/**
	 * Valida que un numero ingresado por teclado este entre el rango que recibe por parametro
	 * @param min
	 * @param max
	 * @return
	 */
	private static int pedirNumero(int min, int max) {
		int input;
		do {
			input = h.printAndAskForNumber("Ingrese un numero entre " + min + " - " +  max );
		} while (!h.intBetwen(input, min, max));
		
		return input ;
	}
	
	
	//Static: el  The static keyword is used for a constant variable or 
	//a method that is the same for every instance of a class.
	public static void main(String[] args) {
		h.print("Pruebo metodo sumar");
		int result1 = sumar();
		h.print("El resltado es: " + result1);
		
		
		h.print("");
		h.print("Pruebo pedir numero");
		int result2 = pedirNumero(20, 30);
		h.print("El resultado de pedir numero es " + result2 );
		
	}
	
}
