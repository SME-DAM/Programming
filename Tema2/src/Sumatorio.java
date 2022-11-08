import java.util.Scanner;

public class Sumatorio {

	private static Scanner sc;

	public static void main(String[] args) {		
		sc = new Scanner(System.in);
		System.out.println("Input the top number: ");
		int top = sc.nextInt();
		long sum = 0;
		for (int i =0; i <= top; i++) {
			sum += i;
		}
		System.out.printf("%d\n", sum);
	}

}
