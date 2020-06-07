package collections.ordered;

import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		Set<Character> alfabeto = new TreeSet<>();
		alfabeto.add('F');
		alfabeto.add('E');
		alfabeto.add('A');
		alfabeto.add('C');
		alfabeto.add('B');
		alfabeto.add('D');
		
		System.out.println(alfabeto);
		
		Mes m1 = new Mes("Janeiro", 1);
		Mes m2 = new Mes("Abril", 4);
		Mes m3 = new Mes("Fevereiro", 2);
		Mes m4 = new Mes("Março", 3);
		Mes m5 = new Mes("Janeiro", 1);
		
		Set<Mes> meses = new TreeSet<>();
		meses.add(m1);
		meses.add(m2);
		meses.add(m3);
		meses.add(m4);
		meses.add(m5);
		
		System.out.println(meses);
		
		Set<Character> alfabetoInvertido = new TreeSet<>(new InverseComparator());
		alfabetoInvertido.add('F');
		alfabetoInvertido.add('E');
		alfabetoInvertido.add('A');
		alfabetoInvertido.add('C');
		alfabetoInvertido.add('B');
		alfabetoInvertido.add('D');
		
		System.out.println(alfabetoInvertido);
	}
}
