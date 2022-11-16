package tema3.matematicas;

public class Ecuaciones {
	public static void segundoGrado(float a, float b, float c) {
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
	public static double[] segundoGradoArray(float a, float b, float c) {
		double[] salida = new double[2];
		double ts = (b*b)-(4*a*c);
		double tdp = (-b)+Math.sqrt(ts);
		double tdm = (-b)-Math.sqrt(ts);
		salida[0]=tdp/(2*a);
		salida[1]=tdm/(2*a);
		return salida;
	}
	
}
