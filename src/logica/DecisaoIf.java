package logica;

import java.util.Scanner;

public class DecisaoIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a sua idade: ");
		int idade = sc.nextInt();
		
		if (idade >= 0 && idade <= 12) {
			System.out.printf("Você têm %d ano(s)! Você é CRIANÇA!%n", idade);
			
		} else if (idade > 12 && idade <= 17) {
			System.out.printf("Você têm %d ano(s)! Você é ADOLESCENTE!%n", idade);
			
		} else if (idade > 17 && idade <= 59) {
			System.out.printf("Você têm %d ano(s)! Você é ADULTO!%n", idade);
			
		} else if (idade > 59) {
			System.out.printf("Você têm %d ano(s)! Você é IDOSO!%n", idade);
			
		} else {
			System.out.printf("Não existe idade negativa!%n");
		}
		
		System.out.println("Fim do programa!");
		
		sc.close();
	}
}
