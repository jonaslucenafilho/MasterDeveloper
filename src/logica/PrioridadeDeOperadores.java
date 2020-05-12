package logica;

public class PrioridadeDeOperadores {

	public static void main(String[] args) {
		
		// x = 5 + 3 + sqrt(7 X 7) <= 100 OU NÃO v E v
		boolean v = true;
		
		boolean x = (5 * 3) + Math.sqrt(7 * 7) <= 100 || !v && v;
		
		System.out.println(x);
	}
}
