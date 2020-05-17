package logica;

import java.util.Scanner;

public class Recursao {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = sc.nextInt();
		
		int resultado = fatorial(numero);
		
		System.out.printf("O fatorial de %d � igual a %d %n", numero, resultado);
		
		System.out.println("Fim do programa!");
		
		sc.close();
	}
	
	static int fatorial(int numero) {
		if (numero == 0) {
			return 1;
		}
		
		return numero * fatorial(numero - 1);
	}
}
