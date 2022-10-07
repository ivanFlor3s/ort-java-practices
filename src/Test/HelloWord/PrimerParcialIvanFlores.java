package Test.HelloWord;

import java.util.Scanner;

public class PrimerParcialIvanFlores {
	
	static Scanner input = new Scanner (System.in);
	
	private static final int TOPE_MAXIMO = 1000;
	private static final int TOPE_MINIMO = 1;
	
	static final String MAYOR = "MA";
	static final String MENOR = "ME";
	static final String IGUAL = "IG";
	
	public static void main(String[] args) {
		//Declaro variables
		int numeroSecretoAnterior;
		int numeroSecreto;
		
		String prediccionJug = "";
		String relacionNumeros = "";
		
		
		boolean continuaJugando= true;
		int contadorPuntaje = 0;
		
		
		numeroSecretoAnterior = obtenerNumeroRandom();
		System.out.println("Mi primer numero fue el: " + numeroSecretoAnterior);
		
		do {
			//Input de jugador para adivinar prox numero
			do {
				System.out.println("Como sera el proximo numero respecto a este? ([MA]yor, [ME]nor o [IG]ual)");
				prediccionJug = input.nextLine().toUpperCase();			
			} while (prediccionJug.isEmpty()  && !(prediccionJug.equals(MAYOR) || prediccionJug.equals(MENOR) || prediccionJug.equals( IGUAL)) );
			
			//Generar nuevo numero secreto
			numeroSecreto = obtenerNumeroRandom();
			
			//Comparar numeros generados por el programa
			if(numeroSecreto == numeroSecretoAnterior) {
				relacionNumeros = IGUAL;
			} 
			else {
				if( numeroSecreto > numeroSecretoAnterior) {
					relacionNumeros = MAYOR;
				}
				else {
					relacionNumeros = MENOR;
				}
			}
			
			continuaJugando = relacionNumeros.equals(prediccionJug) ;
			
			if(continuaJugando) {
				System.out.println("Mi numero actual es el " +  numeroSecreto +" (" + prediccionJug + " respecto al anterior)");
				System.out.println("Acertaste!");
				contadorPuntaje ++;
				//Actualizo numero anterior
				numeroSecretoAnterior = numeroSecreto;
			} else {
				System.out.println("Mi numero actual es el " +  numeroSecreto +" (" + relacionNumeros + " respecto al anterior)");
			}
			
		} while ( continuaJugando );
		
		System.out.println("Perdiste. Acertaste " + contadorPuntaje + " rondas");
		
	}
	
	public static int obtenerNumeroRandom() {
		return TOPE_MINIMO + (int)(Math.random() * (TOPE_MAXIMO - TOPE_MINIMO + 1));
	}

}
