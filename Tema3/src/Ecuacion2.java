import java.util.Scanner;

public class Ecuacion2 {

	private static Scanner sc;

	static void resolver(float a, float b, float c) {
		double ts = (b*b)-(4*a*c);
		if (ts > 0) {
			double tdp = (-b)+Math.sqrt(ts);
			double tdm = (-b)-Math.sqrt(ts);
			System.out.printf("X1 = %f\n",tdp/(2*a));
			System.out.printf("X2 = %f\n\n",tdm/(2*a));
		}
		else {
			System.out.print("Irresoluble\n\n");
		}
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Introduce primer termino (el de x^2)");
		float a = sc.nextFloat();
		System.out.println("Introduce segundo termino (el de x)");
		float b = sc.nextFloat();
		System.out.println("Introduce tercer termino");
		float c = sc.nextFloat();
		
		resolver(a, b, c);
	}

}
