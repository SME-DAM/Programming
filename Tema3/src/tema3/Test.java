package tema3;
import java.util.Arrays;

import tema3.matematicas.*;
public class Test {

	public static void main(String[] args) {
		int[] test = MyArrays.generateArray(10,0,10);
		System.out.println("Array test");
		for (int index =0; index < test.length; index++) {
			System.out.printf("%d ", test[index]);
		}
		System.out.println("\nFlip array");
		int[] fliped = MyArrays.flipArray(test);
		for (int index =0; index < fliped.length; index++) {
			System.out.printf("%d ", fliped[index]);
		}
		System.out.println("\nRotate Left 2");
		fliped = MyArrays.rolArray(fliped,2);
		for (int index =0; index < fliped.length; index++) {
			System.out.printf("%d ", fliped[index]);
		}
		System.out.println("\nRotate Right 2");
		fliped = MyArrays.rorArray(fliped,2);
		for (int index =0; index < fliped.length; index++) {
			System.out.printf("%d ", fliped[index]);
		}
		fliped = MyArrays.flipArray(fliped);
		System.out.println("\nFlip array again");
		for (int index =0; index < fliped.length; index++) {
			System.out.printf("%d ", fliped[index]);
		}
		System.out.printf("\nEl original %ses igual al test",Arrays.equals(test,fliped)?"":"no ");
	}
}
