package logica;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de notas: ");
		int quantidadeNotas = sc.nextInt();
		
		double[] notas = new double[quantidadeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i + 1) + ":" );
			double nota = sc.nextDouble();
			notas[i] = nota; 
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ": " + notas[i]);
		}
		
		sc.close();
	}
}
