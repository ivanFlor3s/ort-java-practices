package Test.HelloWord;

public class ejercicio25 {

	static final String CARACTER = "X";
	public static void main(String[] args) {
		MyHelper h = new MyHelper();
		
		int anchoMatriz = h.printAndAskForNumber("Ingrese un ancho");
		int altoMatriz = h.printAndAskForNumber("Ingrese un alto");
		
		for (int i = 0; i < altoMatriz; i++) {
			for (int j = 0; j < anchoMatriz; j++) {
				h.printInLine(CARACTER);
			}
			h.print("");
		}
		
		h.asesinarScanner();

	}

}
