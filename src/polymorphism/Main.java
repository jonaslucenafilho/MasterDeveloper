package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Veiculo v = new Veiculo();
		v.andar();
		
		Automovel a = new Automovel();
		a.andar();
		
		Veiculo v2 = new Automovel();
		v2.andar();
		
		Veiculo a2 = new Automovel();
		Automovel auto = (Automovel) a2;
		auto.acelerar();
		
		Veiculo vb = new Bicicleta();
		if (vb instanceof Automovel) {
			Automovel auto2 = (Automovel) vb;
			auto2.acelerar();
		} else {
			System.out.println("O tipo não é compatível");
		}
	}
}
