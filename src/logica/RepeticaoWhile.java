package logica;

import java.util.Scanner;

public class RepeticaoWhile {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota;
		int contador = 1;
		double soma = 0;
		
		do {
			System.out.println("Digite a nota " + contador + ": ");
			nota = sc.nextDouble();
			
			if (nota != -1) {
				soma += nota;
				System.out.println("Soma = " + soma);				
				contador++; 
			}
			
		} while (nota != -1);
		
		double media = soma / (contador - 1);
		System.out.println("Média = " + media);
		
		System.out.println("Fim do programa!");
		
		sc.close();
	}	
}
