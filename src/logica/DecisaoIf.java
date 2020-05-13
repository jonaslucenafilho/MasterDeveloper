package logica;

import java.util.Scanner;

public class DecisaoIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a sua idade: ");
		int idade = sc.nextInt();
		
		if (idade >= 0 && idade <= 12) {
			System.out.printf("Voc� t�m %d ano(s)! Voc� � CRIAN�A!%n", idade);
			
		} else if (idade > 12 && idade <= 17) {
			System.out.printf("Voc� t�m %d ano(s)! Voc� � ADOLESCENTE!%n", idade);
			
		} else if (idade > 17 && idade <= 59) {
			System.out.printf("Voc� t�m %d ano(s)! Voc� � ADULTO!%n", idade);
			
		} else if (idade > 59) {
			System.out.printf("Voc� t�m %d ano(s)! Voc� � IDOSO!%n", idade);
			
		} else {
			System.out.printf("N�o existe idade negativa!%n");
		}
		
		System.out.println("Fim do programa!");
		
		sc.close();
	}
}
