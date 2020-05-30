package wrappers;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		int i = 10;
		
		Integer integer = Integer.valueOf(i);
		i = integer.intValue();
		System.out.println(i);
		
//		double d = null;
		Double d2 = null;
		
		List<Integer> list = new ArrayList<>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(2));
		list.add(Integer.valueOf(3));
		System.out.println(list);
		
		print(Integer.valueOf(20));
		
//		autoboxing
		Integer x = 20;
		x++;
		print(x);
		
		Integer y = Integer.valueOf(20);
		int temp = y.intValue();
		temp++;
		y = Integer.valueOf(temp);
		print(y);
		
		print(true);
		
		List<Integer> lista2 = new ArrayList<>();
		lista2.add(1);
		lista2.add(10);
		lista2.add(50);
		
		for (int j : lista2) {
			print(j);
		}
		
		Integer abc = Integer.valueOf(60);
		int cba = abc;
		System.out.println(cba);	
	}
	
	private static void print(Object obj) {
		System.out.println(obj);
	}
}
