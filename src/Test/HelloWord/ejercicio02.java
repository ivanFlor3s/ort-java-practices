package Test.HelloWord;
import java.util.Scanner;

public class ejercicio02 {
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		
		MyHelper helper = new MyHelper(); 
		
		int nota1 = 0, nota2 = 0, nota3 = 0;
		
		nota1 = helper.printAndAskForNumber("Ingrese primer nota");
		nota2 = helper.printAndAskForNumber("Ingrese segunda nota");
		nota3 = helper.printAndAskForNumber("Ingrese tercer nota");
		
		helper.asesinarScanner();

		
	}

}
