package examen;

public class Ejercicio_1 {
	
	public static void main(String[] args) {
		String lista2 = "", lista3 = "", lista23="";
		int cuenta2=0, cuenta3=0, cuenta23=0;
		for (int i = 2; i <= 100; i++) {
			if ((i%2==0)&&(i%3==0)) {
				cuenta23++;
				lista23 += (i + " ");
			}
			if (i%2==0) {
				cuenta2++;
				lista2 += (i + " ");
			}
			if (i%3==0){
				cuenta3++;
				lista3 += (i + " ");
			}
		}
		System.out.printf("Multipos de 2(%d): %s\n",cuenta2,lista2);
		System.out.printf("Multipos de 3(%d): %s\n",cuenta3,lista3);
		System.out.printf("Multipos de 2 y 3(%d): %s\n",cuenta23,lista23);
	}
}
