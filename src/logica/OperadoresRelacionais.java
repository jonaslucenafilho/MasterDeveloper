package logica;

import java.util.Scanner;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		int a = sc.nextInt();

		System.out.println("Informe o segundo n�mero: ");
		int b = sc.nextInt();
		
		boolean iguais = (a == b);
		System.out.println("Iguais? " + iguais);
		
		boolean diferentes = (a != b);
		System.out.println("Diferentes? " + diferentes);
		
		boolean primeiroMaiorQueSegundo = (a > b);
		System.out.println("Primeiro maior que segundo? " + primeiroMaiorQueSegundo);
		
		boolean primeiroMaiorIgualQueSegundo = (a >= b);
		System.out.println("Primeiro maior igual que segundo? " + primeiroMaiorIgualQueSegundo);
				
		sc.close();
	}
}
