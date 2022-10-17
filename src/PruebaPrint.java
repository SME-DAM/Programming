
public class PruebaPrint {

	public static void main(String[] args) {
		/*
		System.out.println("Welcome all!");
		float pi = 3.14159F;
		System.out.println(pi);
		int entero = (int) (pi*100);
		System.out.println(entero);
		pi = entero;
		System.out.println(pi/100);
		
		String test = "Hola";

		test.toLowerCase();
		*/
		
		int a = 2, b = 3, c;
		//System.out.println("Valor en A: " + a + " Valor en B: " + b );
		String t = "Espa\u00F1a";
		System.out.println(t);
		
		System.out.printf("Valor en A: %d, Valor en B: %d\n", a, b);
		c=a;
		a=b;
		b=c;
		System.out.printf("Valor en A: %d, Valor en B: %d\n", a, b);
		
		/*
		final int BIG_CAPACITY = 5, LITTLE_CAPACITY = 3; 				//constants to keep track of the bottles capacity
		int big = 0, little = 0;										//variables to keep track of the liquid amount
		big = BIG_CAPACITY;												//we fill the big bottle
		big -= LITTLE_CAPACITY; little = LITTLE_CAPACITY;				//we fill the small bottle with the big one
		little = 0; 													//empty the small one
		little = big; big = 0;											//then transfer the liquid on the big to the small one 
		big = BIG_CAPACITY;												//refill the big bottle again
		big -= (LITTLE_CAPACITY - little); little = LITTLE_CAPACITY;	//and refill the little to it's max capacity
		System.out.printf("Cantidad en botella: %d\n", big);
		*/
				
	
	}

}
