package polymorphism;

public class Automovel extends Veiculo {
	
	@Override
	public void andar() {
		System.out.println("Autom�vel est� andando");
	}
	
	public void acelerar() {
		System.out.println("Autom�vel est� acelerando");
	}
}
