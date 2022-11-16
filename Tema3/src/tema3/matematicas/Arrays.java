package tema3.matematicas;

public class Arrays {

	public static int[] generateArray(int lenght, int min, int max) {
		int output[] = new int[lenght];
		int erval = max - min + 1;
		for (int index =0; index < lenght; index++) {
			output[index]= (int) (Math.random() * erval) + min;
		}
		return output;
	}
	
	public static int minInArray(int input[]) {
		int output = Integer.MAX_VALUE;
		for (int index =0; index < input.length; index++) {
			output = output<input[index]?output:input[index];
		}
		return output;
	}

	public static int maxInArray(int input[]) {
		int output = Integer.MIN_VALUE;
		for (int index =0; index < input.length; index++) {
			output = output>input[index]?output:input[index];
		}
		return output;
	}
	public static float meanOfArray(int input[]) {
		float output = 0;
		for (int index =0; index < input.length; index++) {
			output += input[index];
		}
		return (output/input.length);
	}
	public static boolean isInArray(int input[], int looking) {
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
		int output[] = new int[input.length];
		for (int index =0; index < size; index++) {
			output[index] = input[size-index];
		}
		return output;
	}
}
