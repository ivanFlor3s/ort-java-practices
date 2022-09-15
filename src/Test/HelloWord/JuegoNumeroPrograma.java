package Test.HelloWord;


public class JuegoNumeroPrograma {

	static MyHelper h = new MyHelper();
	
	final static int TOPE_MAX = 1;
	final static int TOPE_MIN = 0;
	
	
	
	public static void main(String[] args) {
		String jugador1;
		String jugador2;
		
		boolean ganoJ1 = false;
		boolean ganoJ2 = false;
		
		int eleccionJugador1, eleccionJugador2;
		
		//contador
		int cantRondasJugadas = 0;
		
		do {
			jugador1 = h.printAndAskForString("Ingrese el nombre del jugador 1");
		} while (jugador1.isEmpty());
		
		do {
			jugador2 = h.printAndAskForString("Ingrese el nombre del jugador 2");
		} while (jugador2.isEmpty());
		
		int cantRondasMax = h.printAndAskForNumber("Ingrese la cantidad maxima de rondas");
		
		do {
			
			do {
				eleccionJugador1 = h.printAndAskForNumber("Ingrese la eleccion del jugador 1");
			} while ( !(eleccionJugador1 >= TOPE_MIN && eleccionJugador1 <= TOPE_MAX) );
			
			do {
				eleccionJugador2 = h.printAndAskForNumber("Ingrese la eleccion del jugador 2");
			} while ( !(eleccionJugador2 >= TOPE_MIN && eleccionJugador2 <= TOPE_MAX) );
			
			cantRondasJugadas ++ ;
			
			int numeroSecreto = h.getRandomNumber(TOPE_MIN, TOPE_MAX);
			h.print("El numero elejido por el programa fue: " + numeroSecreto);

			ganoJ1 = eleccionJugador1 == numeroSecreto;
			ganoJ2 = eleccionJugador2 == numeroSecreto;
			
			
		} while ( !(ganoJ1 || ganoJ2) && cantRondasJugadas < cantRondasMax );
		
		if(ganoJ1 && ganoJ2) {
			h.print("Hubo un empate");
		}
		else {
			if(ganoJ1) {
				h.print("Gano el jugador 1 " + jugador1);
			}
			else if ( ganoJ2) {
				h.print("Gano el jugador 2 " + jugador2);
			}
			else {
				h.print("Perdieron ambos");
			}
		}
		
	}

}
