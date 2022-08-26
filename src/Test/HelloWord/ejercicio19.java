package Test.HelloWord;

public class ejercicio19 {

	public static void main(String[] args) {
		
		
		MyHelper helper = new MyHelper(); 
		
		boolean esInpar = false;
		boolean esDeUnSoloDigito = false;
		boolean noEstaEnNinguno = false;
		boolean estaEnAmbosGrupos = false;
		
		int numero;
		numero = helper.printAndAskForNumber("Ingrese un numero entero");
		
		esInpar = (numero%2 != 0);
		esDeUnSoloDigito = numero >= 0 && numero < 10;
		estaEnAmbosGrupos = esInpar && noEstaEnNinguno;
		noEstaEnNinguno = !esInpar && !esDeUnSoloDigito;
		
		if (esInpar) {
			helper.print("El numero es inpar");
		}
		if (esDeUnSoloDigito) {
			helper.print("El numero es de un Ssolo digito");
		}
		if(estaEnAmbosGrupos) {
			helper.print("El numero esta en ambos grupos, es muy popular");
		}
		if (noEstaEnNinguno) {
			helper.print("Es un pobre bastardo");
		}
		
		
		
		helper.asesinarScanner();
		
	}

}
