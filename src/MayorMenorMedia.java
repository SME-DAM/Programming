import java.util.Scanner;

public class MayorMenorMedia {


	private static Scanner sc;

	public static void main(String[] args) {
		boolean termina=false;
		int num = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE,total=0, cuenta=0;
		sc = new Scanner (System.in);
		while(!termina) {
			num=sc.nextInt();
			if (num==0){
				termina=true;
			} else {
				total+=num;
				cuenta++;
				max=Math.max(max, num);
				min=Math.min(min, num);
			}
		}
		System.out.printf("Numeros totales: %d\n",cuenta);
		System.out.printf("Media: %f\n",(float)total/cuenta);
		System.out.printf("Numero mayor: %d\n",max);
		System.out.printf("Numero menor: %d\n",min);
	}
}
