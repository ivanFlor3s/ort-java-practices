package Test.HelloWord;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Scanner input = new Scanner(System.in);
		int dia;
		int mes;
		int anio;
		int cantColegios;
		int numEscuela;
		int cantAlumnos;
		char especialidad;
		char sexo;
		char opinion;
		int dni;
		int diaNacimiento;
		int mesNacimiento;
		int anioNacimiento;
		int cantEncuestados=0;
		System.out.println("ingrese el dia de hoy (numero)");
		dia = Integer.parseInt(input.nextLine());
		while (dia < 0 || dia > 31) {
			System.out.println("ingrese una fecha valida");
			dia = Integer.parseInt(input.nextLine());
		}
		System.out.println("ingrese el mes (numero)");
		mes = Integer.parseInt(input.nextLine());
		while (mes < 0 || mes > 12) {
			System.out.println("ingrese una fecha valida");
			mes = Integer.parseInt(input.nextLine());
		}
		System.out.println("ingrese el Año (numero)");
		anio = Integer.parseInt(input.nextLine());
		while (anio < 2000 || anio > 2022) {
			System.out.println("ingrese una fecha valida");
			anio = Integer.parseInt(input.nextLine());
		}
System.out.println("a cuantos colegios se va a hacer la encuesta?");
cantColegios=Integer.parseInt(input.nextLine());
while(cantColegios<0) {
	System.out.println("Error.");
	System.out.println("ingrese una cantidad valida");
}
for(int i = 0; i<cantColegios; i++) {
	System.out.println("ingrese el numero de la escuela");
	numEscuela=Integer.parseInt(input.nextLine());
	while(numEscuela<0) {
		System.out.println("Error");
		System.out.println("Ingrese un numero valido");
		numEscuela=Integer.parseInt(input.nextLine());
	}
	System.out.println("ingrese la cantidad de alumnos");
	cantAlumnos=Integer.parseInt(input.nextLine());
	while(cantAlumnos<0) {
		System.out.println("Error");
		System.out.println("ingrese una cantidad valida");
		cantAlumnos=Integer.parseInt(input.nextLine());
	}
	System.out.println("ingrese la especialidad del colegio,T para tecnico y N para no tecnico");
	especialidad = input.nextLine().toUpperCase().charAt(0);
	while(especialidad!='T'|| especialidad!='T') {
		System.out.println("Error");
		System.out.println("ingrese un valor valido(T o N)");
		especialidad = input.next().toUpperCase().charAt(0);
	}
	do {
		System.out.println("encuesta para alumnos");
		System.out.println("ingrese su DNI");
		//https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
		String aux = input.nextLine();
		dni = Integer.parseInt(aux);
		while(dni<0) {
			System.out.println("error");
			System.out.println("ingrese un numero valido");
			dni=Integer.parseInt(input.nextLine());
		}
		System.out.println("ingrese el dia en que nacio");
		diaNacimiento=Integer.parseInt(input.nextLine());
		while(diaNacimiento<0||diaNacimiento>31) {
			System.out.println("Error");
			System.out.println("Ingrese una fecha valida");
			diaNacimiento=Integer.parseInt(input.nextLine());
		}
		System.out.println("Ingrese el mes en que nacio");
		mesNacimiento=Integer.parseInt(input.nextLine());
		while(mesNacimiento<0||mesNacimiento>=12) {
			System.out.println("Error");
			System.out.println("Ingrese un mes valido");
			mesNacimiento=Integer.parseInt(input.nextLine());
		}
		System.out.println("Ingrese el año en que nacio");
		anioNacimiento=Integer.parseInt(input.nextLine());
		while(anioNacimiento<1990||anioNacimiento>2010) {
			System.out.println("Error");
			System.out.println("Ingrese una fecha valida");
			anioNacimiento=Integer.parseInt(input.nextLine());
		}
		System.out.println("Ingrese su sexo (M o F)");
		sexo = input.next().toUpperCase().charAt(0);
		while(sexo!='M'||sexo!='F') {
			System.out.println("Error");
			System.out.println("ingrese un caracter valido");
			sexo = input.next().toUpperCase().charAt(0);
		}
		System.out.println("Ingrese su opinion sobre los conocimientos adquiridos(B buena o M mala)");
		opinion = input.next().toUpperCase().charAt(0);
		while(opinion!='B'||opinion!='M') {
			System.out.println("Error");
			System.out.println("Ingrese un caracter valido");
			opinion = input.next().toUpperCase().charAt(0);
			
			cantEncuestados++;
		}

	} while(dni!=0);
	
	}
		
	}


}
