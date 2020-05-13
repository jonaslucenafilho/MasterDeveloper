package logica;

import java.util.Scanner;

public class RepeticaoWhile2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota = 0;
		int contador = 1;
		double soma = 0;
		
		while (true) {
			System.out.println("Digite a nota " + contador + ":");
			nota = sc.nextDouble();
			
			if (nota == -1) {
				contador--;
				break;
			}
			
			soma += nota;
			System.out.println("Soma = " + soma);
			contador++;
		}
		
		double media = soma / (contador);
		System.out.println("Média = " + media);
		
		System.out.println("Fim do programa!");
		
		sc.close();
	}	
}
