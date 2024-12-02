package principal;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Declaración de la variable que va a tener la nota
		int nota = 5;
		
		//Vamos a participar en el if
		if (nota>8) {
			System.out.println("Sobresaliente");
		}else if (nota>6) {
			System.out.println("Notable");
		}else if (nota>5) {
			System.out.println("Bien");
		}else if (nota==5) {
			System.out.println("Suficiente");
		}else if (nota>2) {
			System.out.println("Insuficiente");
		}else if (nota<2) {
			System.out.println("Muy deficiente");
		}

	}

}
