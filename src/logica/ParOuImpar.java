package logica;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.printf("O n�mero %d � par!", x );
		} else {
			System.out.printf("O n�mero %d � �mpar!", x);
		}

		sc.close();
	}

}
