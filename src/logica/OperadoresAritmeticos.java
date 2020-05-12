package logica;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		String texto1;
		String texto2;
		
		System.out.println("Digite o primeiro texto: ");
		texto1 = sc.next();
		
		System.out.println("Digite o segundo texto: ");
		texto2 = sc.next();
		
		String texto3 = texto1 + texto2;
		System.out.println("A junção dos textos digitados é: " + texto3);
		
		sc.close();
	}
}
