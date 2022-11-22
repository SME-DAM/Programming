package tema3.utilidades;

public class Sorters {
	static public void bubble(int[] vector) {
		boolean working = true;
		while (working) {
			working=false;
			for(int index = 0; index < vector.length - 1; index++) {
				if (vector[index]>vector[index+1]) {
					int temp = vector[index];
					vector[index] = vector[index + 1];
					vector[index + 1] = temp;
					working=true;
				}
				
			}
		}
	}
}
