package tema3;
import tema3.matematicas.*;
public class Test {

	public static void main(String[] args) {
		int[] test = Arrays.generateArray(10,0,10);
		for (int index =0; index < test.length; index++) {
			System.out.printf("%d ", test[index]);
		}
		System.out.print("\n");
		System.out.println(Arrays.indexInArray(test,0));
		
	}
}
