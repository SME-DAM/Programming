import java.util.Scanner;

public class Divisores {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Cantidad: ");
		int n = sc.nextInt();
		for(int i =1; i <= n;i++) {
			if ((n%i)==0) {
				System.out.printf("%d,",i);
			}
		}
	}

}
