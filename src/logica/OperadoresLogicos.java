package logica;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		// Nega��o (N�O)
		boolean a = true;
		
		System.out.println(!a);
		
		// Conjun��o (E)
		boolean b = true;
		boolean c = false;
		
		System.out.println(b && c);
		
		// Disjun��o (OU)
		boolean d = true;
		boolean e = false;
		
		System.out.println(d || e);
		
	}
}
