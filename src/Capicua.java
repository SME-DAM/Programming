import java.util.Scanner;

public class Capicua {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("numero:");
		String s = sc.next();
		int l = s.length()-1;
		boolean c = true;
		for (int i = l; i> l/2; i--) {
			if (s.charAt(i)!=s.charAt(l-i)) {
				c=false;
				break;
			}
		}
		System.out.printf("%s %ses capicua\n",s,c?"":"no ");
	}

}
