package tema3.matematicas;

public class Ecuaciones {
	static void segundoGrado(float a, float b, float c) {
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
	
}
