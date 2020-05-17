package logica;

import java.util.Scanner;

public class Metodo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números da sequência de Fibonacci você quer visualizar?");
		int vezes = sc.nextInt();

		int [] valores = calcularFibonacci(vezes);
		
		for(int v : valores) {
			System.out.print(v + "-");
		}
		
		System.out.println();
		
		System.out.println("Quantos números da sequência de Fibonacci você quer visualizar?");
		vezes = sc.nextInt();

		System.out.println("Você deseja separar os resultados com: ");
		String separador = sc.next();

		calcularFibonacci(vezes, separador);
		
		System.out.println();
		System.out.println("Fim do Programa!");

		sc.close();
	}

	static void calcularFibonacci(int vezes, String separador) {
		for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			System.out.print(i + separador);

			i = i + j;
			j = i - j;
		}
	}

	static int[] calcularFibonacci(int vezes) {

		int[] resposta = new int[vezes];

		for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			resposta[cont] = i;
			
			i = i + j;
			j = i - j;
		}
		
		return resposta;
	}
}
