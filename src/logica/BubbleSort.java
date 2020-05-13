package logica;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] numeros = { 7, 3, 1, 2, 4, 9, 5, 6, 8, 10 };
		
		for (int i = 0; i < numeros.length - 1; i++) {
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[i] > numeros[j]) {
					int aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}	
			}
		}
		
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
	}
}
