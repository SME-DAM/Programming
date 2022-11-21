package tema3.utilidades;

public class MyArrays {

	public static  void printArray(int[] input) {
		System.out.print("( ");
		for (int index = 0; index < input.length; index++) {
			System.out.printf("%d ", input[index]);
		}
		System.out.println(").");
	}
	public static int[] generateArray(int lenght, int min, int max) {
		int output[] = new int[lenght];
		int erval = max - min + 1;
		for (int index =0; index < lenght; index++) {
			output[index]= (int) (Math.random() * erval) + min;
		}
		return output;
	}

	public static int minInArray(int[] input) {
		int output = Integer.MAX_VALUE;
		for (int index = 0; index < input.length; index++) {
			output = output < input[index] ? output : input[index];
		}
		return output;
	}

	public static int maxInArray(int[] input) {
		int output = Integer.MIN_VALUE;
		for (int index =0; index < input.length; index++) {
			output = output>input[index]?output:input[index];
		}
		return output;
	}
	public static float meanOfArray(int[] input) {
		float output = 0;
		for (int index =0; index < input.length; index++) {
			output += input[index];
		}
		return (output/input.length);
	}
	
	public static boolean isInArray(int[] input, int looking) {
		for (int index =0; index < input.length; index++) {
			if (input[index] == looking) {
				return true;
			}
		}
		return false;
	}

	public static int indexInArray(int input[], int looking) {
		for (int index =0; index < input.length; index++) {
			if (input[index] == looking) {
				return index;
			}
		}
		return -1;
	}
	
	public static int[] flipArray(int input[]) {
		int size = input.length;
		int output[] = new int[size];
		for (int index = 0; index < size; index++) {
			output[index] = input[size-(index + 1)];
		}
		return output;
	}
	
	public static int[] rolArray(int input[], int steps) {
		int size = input.length;
		int output[] = new int[size];
		for (int index = 0; index < size; index++) {
			output[index] = input[(index + steps)% size];
		}
		return output;
	}
	
	public static int[] rorArray(int input[], int steps) {
		int size = input.length;
		int output[] = new int[size];
		for (int index = size - 1; index >= 0; index--) {
			output[index] = input[(index + steps)% size];
		}
		return output;
	}
}
