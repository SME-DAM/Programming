import java.util.Scanner;

public class PrimoCercano {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Introduce un numero mayor que 2: ");
		int n = sc.nextInt();
		int p=n;
		if (n < 2) {
			System.out.print("no es valido");
		} else {
			boolean primo=false;
			while(!primo) {
				p--;
				primo=true;
				for (int i =2; i < p; i++) {
					if (p%i==0) {
						primo=false;
					}
				}
			}
			System.out.printf("El primo mas cercano por debajo de %d es %d",n,p);
		}
	}

}
