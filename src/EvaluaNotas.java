import java.util.Scanner;

public class EvaluaNotas {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		
		System.out.println("Introduce la nota ponderada sobre 10");
		
		float nota = entrada.nextFloat();
		
		if (nota < 0 || nota > 10) {
			System.out.println("Nota no válida!");
		} else {
			if (nota < 5 ) {
				System.out.println("Suspenso");
			} else if (nota < 6) {
				System.out.println("Aprobado");
			} else if (nota < 7) {
				System.out.println("Aprobado alto");
			} else if (nota < 8) {
				System.out.println("Notable");
			} else if (nota < 9) {
				System.out.println("Notable alto");
			} else if (nota < 10) {
				System.out.println("Sobresaliente");
			} else if (nota == 10) {
				System.out.println("Matricula de honor");
			}
		}

	}

}
