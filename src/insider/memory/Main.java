package insider.memory;

public class Main {

	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		a1.nome = "Jonas";
		a1.nota = 9.5;
		
		Aluno a2 = criarAluno("Marina", 9.0);
		diminuirNota(a2);
		
		System.out.println(a2.nome);
		System.out.println(a2.nota);
		
		a2 = new Aluno();
		a2.nome = "Bruno";
		a2.nota = 7.5;
		
		System.out.println(a2.nome);
		System.out.println(a2.nota);
	}
	
	static Aluno criarAluno(String nome, double nota) {
		Aluno a = new Aluno();
		a.nome = nome;
		a.nota = nota;
		return a;
	}
	
	static void diminuirNota(Aluno a) {
		a.nota--;
	}
}
