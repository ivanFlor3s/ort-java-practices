package ejercicio201;

import Test.HelloWord.MyHelper;

public class SuperHeroeTest {

	public static void main(String[] args) {
		
		MyHelper h = new MyHelper();
		
		SuperHeroe h1 = new SuperHeroe("Batman",90, 70, 0);
		SuperHeroe h2 = new SuperHeroe("Superman",95,60,79);
		
		h.print(h1.competir(h2));
		h.print(h2.competir(h1));
	}
}
