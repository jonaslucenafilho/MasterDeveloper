package errors;

public class Aplicacao {

	public static void main(String[] args) {
		
//		ContatoPF c1 = new ContatoPF();
//		c1.setNome("Jonas");
//		c1.setCpf("123.456.789-10");
		
		ContatoPJ c1 = new ContatoPJ();
		c1.setNome("MecDonaldis");
		c1.setCnpj("01.234.567/8910-11");
		
//		c1.setEndereco(new Endereco());
		
		c1.getEndereco().setRua("Rua dos Limões");
		c1.getEndereco().setNumero("100");
		c1.getEndereco().setCidade("Recife");
		c1.getEndereco().setEstado("Pernambuco");
		
		Agenda agenda = new Agenda();
		agenda.setContato1(c1);
		
		imprimirNomes(agenda);
		imprimirCnpj(agenda);
		
		System.out.println("Contato definido");
	}
	
	private static void imprimirNomes(Agenda agenda) {
		if (agenda.getContato1() != null) {
			System.out.println(agenda.getContato1().getNome());
		}
		
		if (agenda.getContato2() != null) {
			System.out.println(agenda.getContato2().getNome());
		}
		
		if (agenda.getContato3() != null) {
			System.out.println(agenda.getContato3().getNome());
		}
	}
	
	private static void imprimirCnpj(Agenda agenda) {
		if (agenda.getContato1() != null && agenda.getContato1() instanceof ContatoPJ) {
			ContatoPJ c = (ContatoPJ) agenda.getContato1();
			System.out.println(c.getCnpj());
		}
		
		if (agenda.getContato2() != null && agenda.getContato2() instanceof ContatoPJ) {
			ContatoPJ c = (ContatoPJ) agenda.getContato2();
			System.out.println(c.getCnpj());
		}
		
		if (agenda.getContato3() != null && agenda.getContato3() instanceof ContatoPJ) {
			ContatoPJ c = (ContatoPJ) agenda.getContato3();
			System.out.println(c.getCnpj());
		}
	}
}
