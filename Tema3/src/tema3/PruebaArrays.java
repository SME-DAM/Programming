package tema3;
import tema3.utilidades.MyArrays;
public class PruebaArrays {
	
	public static void main(String[] args) {
		int[] test = MyArrays.generateArray(10, 0, 1000);

		MyArrays.printArray(test);
		
		MyArrays.printArray(MyArrays.rorArray(test, 31));
	}

}
