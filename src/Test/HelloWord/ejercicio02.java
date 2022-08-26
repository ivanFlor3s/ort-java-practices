package Test.HelloWord;

public class ejercicio02 {

	public static void main(String[] args) {
		
		MyHelper helper = new MyHelper(); 
		
		
		int nota1 = 0, nota2 = 0, nota3 = 0;
		
		nota1 = helper.printAndAskForNumber("Ingrese primer nota");
		nota2 = helper.printAndAskForNumber("Ingrese segunda nota");
		nota3 = helper.printAndAskForNumber("Ingrese tercer nota");
		
		
		double promedio = (nota1 + nota2 + nota3)/3;
		
		helper.print("El promedio del alumno es: " + promedio);
		helper.asesinarScanner();
		
		
	}

}
