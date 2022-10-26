import java.util.Scanner;

public class PrimoCercano {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Introduce un numero mayor que 2: ");
		int n = sc.nextInt();
		int p=0;
		if (n < 2) {
			System.out.print("no es valido");
		} else {
			boolean prime=true,found=false;
			while(!found) {
				for (int i = n-1; i>1;i--) {
					prime=true;
					for (int j =2; j <= Math.sqrt(i); j++) {
						if (i%j==0) {
							prime=false;
							break;
						}
					}
					if (prime) {
						p=i;
						found=true;
						break;
					}
				}
			}
			System.out.printf("El primo mas cercano por debajo de %d es %d",n,p);
		}
	}

}
