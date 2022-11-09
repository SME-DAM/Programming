package tema3.utilidades;

public class ManejoCadenas {
	static String flipString(String s) {
		String value = "";
		int length = s.length();
		for (int i = 0; i < length; i++) {
			value += s.charAt(length-i-1);
		}
		return value;
	}
}
