package polymorphism;

public class Bicicleta extends Veiculo {

	@Override
	public void andar() {
		System.out.println("Bicicleta est� andando");
	}
	
	public void empinar() {
		System.out.println("Bicicleta est� empinando");
	}
}
