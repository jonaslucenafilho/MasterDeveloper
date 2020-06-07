package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> listaMercado = new ArrayList<>();
		
		listaMercado.add("Bolo");
		listaMercado.add("Queijo");
		listaMercado.add("Mortadela");
		listaMercado.add("Ovo");
		
		Collections.sort(listaMercado);
		
		System.out.println(listaMercado);
		
		for (String item : listaMercado) {
			System.out.println("Item: " + item);
		}
		
		for (int i = 0; i < listaMercado.size(); i++) {
			System.out.println("Item => " + listaMercado.get(i));
		}
		
		listaMercado.remove(0);
		
		System.out.println(listaMercado);
		
		listaMercado.remove("Ovo");
		
		System.out.println(listaMercado);
		
		System.out.println(listaMercado.contains("Mortadela"));
		
		System.out.println(listaMercado.contains("Sal"));
		
		int posQueijo = listaMercado.indexOf("Queijo");
		System.out.println("Posição Queijo: " + posQueijo);
		
		int posSal = listaMercado.indexOf("Sal");
		System.out.println("Posição Sal: " + posSal);
		
		
	}
}
