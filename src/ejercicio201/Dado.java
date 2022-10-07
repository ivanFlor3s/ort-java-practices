package ejercicio201;

import Test.HelloWord.MyHelper;

public class Dado {
	
	MyHelper h = new MyHelper();

	private int cantCaras;
	private int valor;
	
	public Dado(int cantidad) {
		this.cantCaras = cantidad;
		this.valor = 0;
	}
	
	public void tirar() {
		this.valor = h.getRandomNumber(1, cantCaras);
	}
	
	public int getValor() {
		return this.valor;
	}

}
