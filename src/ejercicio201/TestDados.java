package ejercicio201;

import java.util.ArrayList;
import java.util.Iterator;

import Test.HelloWord.MyHelper;

public class TestDados {
	
	public static void main(String[] args) {
		
		MyHelper h = new MyHelper();
		/*
		///DADOS ---------------------------------------
		Dado d1 = new Dado(6);
		Dado d2 = new Dado(6);
		
		d1.tirar();
		d2.tirar();
		
		int resultD1 = d1.getValor();
		int resultD2 = d2.getValor();
		
		if(resultD1 == resultD2) {
			h.print("El resultado es el mismo: " + resultD1);
		}else {
			h.print( "el resultado mas grande es: " + (resultD1 > resultD2 ? resultD1 : resultD2));
		}
		
		//PROMEDIO DE 100 DADOS
		int acumulador = 0;
		for (int i = 0; i <= 100; i++) {
			d1.tirar();
			d2.tirar();
			acumulador += d1.getValor() + d2.getValor();
			
		}
		h.print("Promedio de 100 tiradas es: " + ((double)acumulador / 100));*/

		
		ArrayList<String> numeros = new ArrayList<>();
		numeros.add("uno");
		numeros.add("dosss");
		numeros.add("tress");
		String numeroFound = null;
		//bbuscar
		int index = 0;
		while (index < numeros.size() && !numeros.get(index).equals("tredss")) {
			index++;
			h.print("aumente index, nuevo value " + index );
		}
		h.print("como salio indexdel loop " + index );

		if (index < numeros.size())
			numeroFound = numeros.get(index);
		
		if(numeroFound == null) {
			h.print("No se encontro");
		} else h.print("Se encontrooo!");
		
		
	}

}
