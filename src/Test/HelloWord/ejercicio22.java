package Test.HelloWord;

import java.util.Iterator;

public class ejercicio22 {

	public static void main(String[] args) {
		MyHelper helper = new MyHelper();
		
		helper.print("Cuenta progresiva");
		for (int i = 1; i < 5; i++) {
			helper.print(Integer.toString(i) );
		}
		
		helper.print("Cuenta regresiva");
		for (int j = 5; j > 1; j--) {
			helper.print(Integer.toString(j) );
		}
		
		helper.asesinarScanner();

	}

}
