package Test.HelloWord;

public class NuncaPierdo {
	
	static final int PORCENTAJE_SEGURO = 20;
	static final int MONTO_MAXIMO = 5000;
	
	static final String RULETA = "RUL";
	static final String BLACK_JACK = "BJK";
	static final String POCKER = "PKR";
	
	public static void main(String[] args) {
		
		String juego;
		MyHelper h = new MyHelper();
		
		int contadorPocker = 0;
		int contadorRuleta = 0;
		int contadorBlackJack = 0;
		
		boolean juegoAceptado = false;
		
		String jugador = h.printAndAskForString("Ingrese nombre de Jugador");
		
		int monto = h.printAndAskForNumber("Ingrese el monto inicial");
		
		while(monto < 500) {
			monto = h.printAndAskForNumber("El monto inicial tiene que ser mayor a 500");
		}
		
		//monto minimo que se le permite
		double seguro = monto * ((double)PORCENTAJE_SEGURO / 100);
		
		boolean dineroSuficiente = true;
		
		while (monto < seguro || dineroSuficiente || monto > monto + MONTO_MAXIMO ) {
			
			//Pregunto por el juego al que quiere jugar
			do {
				juego = h.printAndAskForString("A que juego quiere jugar?");
				juegoAceptado = juego.equals(RULETA)  || juego.equals(BLACK_JACK)  || juego.equals(POCKER);
			} while (!juegoAceptado);
			
			boolean puedeJugar = false;
			int costoJuego = 0;
			
			switch (juego) {
				case RULETA:
					costoJuego = 100;
					h.print("El costo del juego es: " +Integer.toString(costoJuego));
					puedeJugar = monto > costoJuego;
					
					break;
				case BLACK_JACK:
					costoJuego = 200;
					h.print("El costo del juego es: " +Integer.toString(costoJuego));
					puedeJugar = monto > costoJuego;
					break;
				case POCKER:
					costoJuego = 500;
					h.print("El costo del juego es: " +Integer.toString(costoJuego));
					puedeJugar = monto > costoJuego;
					break;
				default:
					h.print("Se le chispoteo");
					break;
			}
			
			if(!puedeJugar) {
				h.print("No te alcanza el dinero para este juego");
			}
			else {
				monto -= costoJuego;
				int randomNumber = h.getRandomNumber(0, 2);
				
				switch(juego) {
				case RULETA:
					contadorRuleta++;
					break;
				case BLACK_JACK:
					contadorBlackJack++;
					break;
				case POCKER:
					contadorPocker++;
					break;
				}
				
				h.print("salio el colorado " + randomNumber + " sssssss");
				switch(randomNumber) {
					case 2 :
						monto += costoJuego * 2;
						break;
					case 1: 
						monto += costoJuego;
					default:
						break;
				}
				h.print("montoActual es " + monto);
				
			}
			dineroSuficiente = monto >= 100;
			
		}
		
		//SALI DEL WHILE
		h.print("Dinero restante " + monto);
		
		h.print("El tipo jugo " + contadorPocker + " veces al pocker");
		h.print("El tipo jugo " + contadorRuleta + " veces a la ruleta");
		h.print("El tipo jugo " + contadorBlackJack + " veces al nego jack");
		
		int totalJuegos = contadorPocker + contadorRuleta + contadorBlackJack;
		
		h.print("El tipo jugo " + ((double)contadorPocker/totalJuegos * 100) + "% veces al pocker");
		h.print("El tipo jugo " + ((double)contadorRuleta/totalJuegos * 100) + "% veces a la ruleta");
		h.print("El tipo jugo " + ((double)contadorBlackJack/totalJuegos * 100) + "% veces al nego jack");
		
		
		h.asesinarScanner();

	}

}
