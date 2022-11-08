
public class Clase {

	public static void main(String[] args) {
		/*
		System.out.print("Se llama \"Juan\"\n");
		System.out.print("Hola que tal\n\tAlumno\n");
		System.out.print("Para escribir una \" tienes que usar \\\"\n");
		System.out.print("Los comentarios se indican con //, no con \\\\");
		int binario = 0b01110101_11111110;
		
		System.out.println(binario);
		System.out.println(Math.sqrt(64));
		*/
		/*
		int entero = -23;
		if (Math.abs(entero) < 127) {
			System.out.println("Cabe en un byte");
		} else {
			System.out.println("No cabe en un byte");
		}
		*/
		
		boolean boleano = true;
		int a = 7, b=5;
		System.out.printf("A mayor que B?\n\t%s\n", ((a>b)?"Si":"NO"));
		
		System.out.printf("El valor es %d\n",boleano?1:0);
		/*
		long largo = entero;
		double doble = largo;
		entero = (int)doble;
		if (entero == 0) {
			System.out.printf("El número %d es igual a 0!",entero);
		} else {
			System.out.printf("El número %d no es 0!",entero);
		}
		*/
	}

}
