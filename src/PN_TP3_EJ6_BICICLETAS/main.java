package PN_TP3_EJ6_BICICLETAS;
import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		Taller t1 = new Taller("Fordcletas",2000,250);
		ArrayList<Bicicleta> bicicletas = new ArrayList<>();
		
		bicicletas.add(new Bicicleta("ombu", 1, 1000));
		bicicletas.add(new BicicletaElectica("ombu xtreme", 1, 50000, 249));
		bicicletas.add(new Bicicleta("old school", 2, 5000));
		bicicletas.add(new BicicletaElectica("old school slayer", 10, 199, 400));
		
		int posibles = t1.cantServiciosPosibles(bicicletas);
		System.out.println(posibles);
	}
}
