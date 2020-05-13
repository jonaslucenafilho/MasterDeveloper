package logica;

import java.util.Scanner;

public class RepeticaoFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número ao qual você quer a tabuada: ");
		int x = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(x + " X " + i + " = " + x * i);
		}
		
		sc.close();
	}
}
