package principal;

import java.util.Scanner;

public class EjercicioSwitch {

	public static void main(String[] args) {
		//Trabajar con Scanner
		Scanner teclado = new Scanner(System.in);
				
		//Declaración de la variable que va a tener la nota
		int nota;
		
		//Usar Scanner
		System.out.println("Introduce una nta entre 1 y 10:");
		nota = teclado.nextInt();
		
		switch (nota) {
			case 1, 2:
				System.out.println("Muy deficiente");
				break;
			case 3, 4:
				System.out.println("Insuficiente");
				break;
			case 5:
				System.out.println("Suficiente");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7, 8:
				System.out.println("Notable");
				break;
			case 9, 10:
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("No se puede tener esa nota");
		}
			if (nota>=5 && nota<=10) {
				System.out.println("Aprobado");
			}else if(nota<5 && nota>=1) {
				System.out.println("Suspenso");
			}
	}

}
