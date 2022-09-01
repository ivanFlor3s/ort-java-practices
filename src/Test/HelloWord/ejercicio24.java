package Test.HelloWord;

public class ejercicio24 {

	public static void main(String[] args) {
		MyHelper helper = new MyHelper();
		
		int num1;
		int num2;
		
		num1 = helper.printAndAskForNumber("Ingrese el primer numero");
		do {
			num2 = helper.printAndAskForNumber("Ingrese el segundo numero, que debe ser mayor o igual al segundo");
		} while (num1 > num2);
		
		helper.print("Recorro incluyendo");
		for (int i = num1; i <= num2; i++) {
			helper.print(Integer.toString(i));
		}
		
		helper.print("Recorro excluyendo");
		for (int j = num1 + 1; j < num2  ; j++) {
			helper.print(Integer.toString(j));
		}
		
		helper.asesinarScanner();

	}

}
