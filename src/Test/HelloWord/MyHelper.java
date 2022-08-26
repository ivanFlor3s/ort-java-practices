package Test.HelloWord;

import java.util.Scanner;

public class MyHelper {
	
	private long startTime;
	static Scanner input;
	
	MyHelper(){
		startTime = System.currentTimeMillis();
		input = new Scanner (System.in);
	}
	
	public void print(String s) {
		System.out.println(s);
	}
	
	public int printAndAskForNumber(String s) {
		print(s);
		return Integer.parseInt(input.nextLine());
	}
	
	public double printAndAskForDouble(String s, double buffer) {
		print(s);
		return  Double.parseDouble(input.nextLine());
	}
	
	public void asesinarScanner() {
		String[] pesames = {"Un minuto de silencio por el scanner",
				"Señoras y señores el scanner... ya no esta entre nosotros",
				"Era tan joven",
				"PORQUE NO FUI YOO SCANER!!!",
				"Hasta la vista scanner",
				"Polvo eres y el garbage collector te llevara",
				"Se nos fue un grande",
				"Que locura el otro dia lo vi y estaba re bien",
				"Es culpa de Macri",
				"800 pesos la docena increible!"
		};
		int rand = getRandomNumber(0,pesames.length - 1);
		print("");
		String miPesame = pesames[rand];
		System.out.println("Murio el scanner");
		System.out.println(miPesame);
		print("El scanner solo vivio: "+ (System.currentTimeMillis() - startTime ) + " ms");
		input.close();
	}
	
	private int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
	
	public boolean esImpar(int numero) {
		return numero % 2 == 0;
	}
	/* TODO Ver que le falta a mi super printAsk para parsear dinamicamente segun el tipo que entra en el buffer
	public <T> void printAndAsk(String s, T buffer ) {
		System.out.println(s);
		if( buffer instanceof String) {
			System.out.println(s);;
		} else if(Integer.class.isInstance(buffer)) {
			buffer = Integer.parseInt(input.nextLine()) ;
		}
		
	}
	*/
	
}
