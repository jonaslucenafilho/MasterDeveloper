package logica;

import java.util.Scanner;

public class ConversorDeTemperatura {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double resultado = 0;
		
		System.out.println("Digite a temperatura: ");
		double temperatura = sc.nextDouble();
		
		System.out.println("De Fahrenheit para Celsius digite 1");
		System.out.println("De Celsius para Fahrenheit digite 2");
		
		System.out.println("Qual você deseja: ");
		int opcao =  sc.nextInt();
		
		if (opcao == 1) {
			resultado = converterParaCelsius(temperatura);
			System.out.printf("Resultado: %.2f° Celsius %n", resultado);
		} else if (opcao == 2) {
			resultado = converterParaFahrenheit(temperatura);
			System.out.printf("Resultado: %.2f° Fahrenheit %n", resultado);
		} else {
			System.out.println("Opção inválida, reinicie o programa!");
		}
		
		System.out.println("Fim do programa!");
		
		sc.close();
	}
	
	static double converterParaCelsius(double temperaturaEmFahrenheit) {
		return (temperaturaEmFahrenheit - 32) / 1.8;	
	}
	
	static double converterParaFahrenheit(double temperaturaEmCelsius) {
		return temperaturaEmCelsius * 1.8 + 32;
	}
}
