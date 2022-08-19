package Test.HelloWord;
import java.util.*;

public class Ejercicio01 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		
		String name;
		
		System.out.println("Enter your username: ");
		name = input.nextLine();
		System.out.println("Bienvenido " + name);
		
	}

}
