package principal;

import java.util.Scanner;

public class EjercicioMes {

	public static void main(String[] args) {
		//Scanner
		Scanner teclado = new Scanner(System.in);
		//Declaración de la variable
		String mes;
		//Usar el Scanner
		System.out.println("Introduce un mes del año");
		mes = teclado.next();
		
		switch (mes) {
			case "Abril", "abril", "Mayo", "mayo":
				System.out.println("PRIMAVERA");
				break;
			case "Julio", "julio", "Agosto", "agosto":
				System.out.println("VERANO");
				break;
			case "Octubre", "octubre", "Noviemnre", "noviembre":
				System.out.println("OTOÑO");
				break;
			case "Enero", "enero", "Febrero", "febrero":
				System.out.println("INVIERNO");
				break;
			case "Marzo", "marzo":
				System.out.println("INVIERNO/PRIMAVERA");
				break;
			case "Junio", "junio":
				System.out.println("PRIMAVERA/VERANO");
				break;
			case "Septiembre", "septiembre":
				System.out.println("VERANO/OTOÑO");
				break;
			case "Diciembre", "diciembre":
				System.out.println("OTOÑO/INVIERNO");
				break;
			default:
				System.out.println("ESCRIBA BIEN EL MES POR FAVOR");
			
		}

	}

}
