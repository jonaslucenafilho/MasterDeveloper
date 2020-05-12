package logica;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		// Negação (NÃO)
		boolean a = true;
		
		System.out.println(!a);
		
		// Conjunção (E)
		boolean b = true;
		boolean c = false;
		
		System.out.println(b && c);
		
		// Disjunção (OU)
		boolean d = true;
		boolean e = false;
		
		System.out.println(d || e);
		
	}
}
