package logica;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos número da sequência de Fibonacci você deseja visualizar? ");
		int vezes = sc.nextInt();

		for (int cont = 0, i = 0, j = 1; cont <= vezes; cont++) {
			System.out.print(i + " ");

			i = i + j;
			j = i - j;
		}

		sc.close();
	}
}
