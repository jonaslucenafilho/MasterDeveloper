package logica;

import java.util.Scanner;

public class RepeticaoFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero ao qual voc� quer a tabuada: ");
		int x = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(x + " X " + i + " = " + x * i);
		}
		
		sc.close();
	}
}
