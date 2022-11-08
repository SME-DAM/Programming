import java.util.Scanner;

public class Meses {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		System.out.println("Introduce el número de mes.");
		int num = entrada.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("Es enero");	
			break;
		case 2:
			System.out.println("Es febrero");	
			break;
		case 3:
			System.out.println("Es marzo");
			break;
		case 4:
			System.out.println("Es abril");
			break;
		case 5:
			System.out.println("Es mayo");
			break;
		case 6:
			System.out.println("Es junio");
			break;
		case 7:
			System.out.println("Es julio");
			break;
		case 8:
			System.out.println("Es agosto");
			break;
		case 9:
			System.out.println("Es septiembre");
			break;
		case 10:
			System.out.println("Es octubre");
			break;
		case 11:
			System.out.println("Es noviembre");
			break;
		case 12:
			System.out.println("Es diciembre");
			break;
		default:
			System.out.println("Comprate un calendario!");
			break;
		}
		
	}

}
