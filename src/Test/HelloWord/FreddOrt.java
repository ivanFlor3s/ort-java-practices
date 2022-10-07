package Test.HelloWord;

public class FreddOrt {
	
	static MyHelper h = new MyHelper();
	
	final static char CHICO = 'C';
	final static char MEDIANO = 'M';
	final static char GRANDE = 'G';

	
	final static int MAX_GRANDES_VENDIDOS = 20;
	final static char INPUT_FIN= 'Z';
	
	public static void main(String[] args) {
	
	
	char inputSize = h.printAndAskForString("Ingrese el tamaño").charAt(0);
	
	int cantMedianosVend = 0;
	int cantChicosVend = 0;
	int cantGrandesVend = 0;
	
	
	while ((cantGrandesVend <= 20) && (inputSize != INPUT_FIN) )  {
		switch(inputSize) {
			case CHICO:
				cantChicosVend++;
				break;
			case MEDIANO:
				cantMedianosVend++;
				break;
			case GRANDE:
				cantGrandesVend++;
				break;
		}
	}
		
		

	}

}
