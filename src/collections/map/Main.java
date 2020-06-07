package collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Map<Integer, String> meses = new HashMap<>();
		
		meses.put(1, "Janeiro");
		meses.put(2, "Fevereiro");
		meses.put(3, "Março");
		meses.put(12, "Dezembro");
		
		System.out.println(meses);
		
		String m1 = meses.get(1);
		System.out.println(m1);
		
		Set<Integer> chaves = meses.keySet();
		System.out.println(chaves);
		
		Collection<String> valores = meses.values();
		System.out.println(valores);
		
		Set<Map.Entry<Integer, String>> pares = meses.entrySet();
		
		for (Map.Entry<Integer, String> entry : pares) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
