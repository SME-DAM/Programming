import java.util.Scanner;

public class SumaPares {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		boolean ready = false;
		int origen=0,numero=0,cuenta=0;
		while (!ready) {
			try {
				System.out.println("Introduce un número entero mayor que cero");
				numero=sc.nextInt();
				if (numero>0) ready=true;
			} catch (NullPointerException e) {
				System.out.println("No es un número valido");
			}
		}
		origen=numero%2!=0?numero+1:numero;
		for (int i = origen; i <= (origen *numero);i+=2) {
			cuenta+=i;
			System.out.printf("%d ",i);
		}
		System.out.printf("Da: %d\n",cuenta);
	}

}
