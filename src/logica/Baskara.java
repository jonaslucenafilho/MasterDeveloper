package logica;

import java.util.Scanner;

public class Baskara {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		double a = sc.nextDouble();
		
		System.out.println("Digite o valor de b: ");
		double b = sc.nextDouble();
		
		System.out.println("Digite o valor de c: ");
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		if (delta > 0) {
			System.out.println("As raízes da equação são: " + x1 + " e " + x2);
		} else if (delta == 0) {
			System.out.println("A raiz da equação é: " + x1);
		} else {
			System.out.println("A equação não possui raízes, pois o delta é igual a: " + delta);
		}	
		
		sc.close();
	}
}

