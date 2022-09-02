package Test.HelloWord;

import java.util.Scanner;

public class ejercicio39 {
	
	static final int CANTIDAD_MINIMA = 2; 
	static final int CANTIDAD_TIROS = 3;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		//mvp: Most Valuable Player
		int cantJugadores 	= 0; 
		int contadorCentros 	= 0;
		int mvpPuntos 			= 0;
		int acumuladorPuntos 	= 0;
		int bufferDistancia  	= 0;
		
		String mvp = "";
		String bufferJugador = "";
				
		System.out.println("Ingrese la cantidad de jugadores");
		cantJugadores = Integer.parseInt(input.nextLine());
		
		while (cantJugadores > CANTIDAD_MINIMA) {
			System.out.println("La cantidad de jugadores debe ser mayor o igual a " + CANTIDAD_MINIMA + ", ingrese una nueva cantidad");
			cantJugadores = Integer.parseInt(input.nextLine());
		}
		
		for (int i = 0; i < cantJugadores; i++) {
			System.out.println("Ingrese el nombre del jugador " + (i+1));
			bufferJugador = input.nextLine();
			acumuladorPuntos = 0;
			
			for (int j = 0; j < CANTIDAD_TIROS; j++) {
				System.out.println("Ingrese distancia del tiro: " + (j+1));
				bufferDistancia = Integer.parseInt(input.nextLine());
				
				if(bufferDistancia == 0) {
					acumuladorPuntos += 500;
				} 
				else if(bufferDistancia <= 10) {
					acumuladorPuntos += 250;
				}
				else if(bufferDistancia >= 11 && bufferDistancia <= 50) {
					acumuladorPuntos += 100;
				}
				
				if(bufferDistancia <= 50) {
					contadorCentros++;
				}
				
				System.out.println(mvp + " ya tiene " + acumuladorPuntos + " puntos");
				
			}
			
			if(acumuladorPuntos > mvpPuntos) {
				mvp = bufferJugador;
				mvpPuntos = acumuladorPuntos;
				
				System.out.println("Viene ganando: " + mvp);
			}
			
			
		}
		
		System.out.println("El ganador es: " + mvp);
		System.out.println("Hizo " + mvpPuntos + " puntos");
		System.out.println("CANTIDAD DE TIROS AL CENTRO " + contadorCentros);
		

	}

}
