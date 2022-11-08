
public class Multiplos2y3 {

	public static void main(String[] args) {
		int count=0;
		for (int i = 2; i<= 100; i++) {
			if (((i%2)==0) || ((i%3)==0)) {
				System.out.printf("%d,",i);
				count++;
			}
		}
		System.out.printf("\n%d",count);
	}
}
