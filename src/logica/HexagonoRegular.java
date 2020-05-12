package logica;

import java.util.Scanner;

public class HexagonoRegular {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o lado do hexagono: ");
		double lado = sc.nextDouble();
		
		double perimetro = 6 * lado;
		
		double area = (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
		
		System.out.printf("Perímetro do Hexagono: %.2fm %n", perimetro);
		System.out.printf("Área do Hexagono: %.2fm²", area);
		
		sc.close();
	}
}
