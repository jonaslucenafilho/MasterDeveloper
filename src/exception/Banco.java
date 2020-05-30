package exception;

public class Banco {
	
	public void realizarOperacao() {
		
		ContaBancaria conta = new ContaBancaria();

		try {
			conta.sacar(100);
			
			double saldo = conta.getSaldo();
			System.out.println("Saldo: " + saldo);
		
		} catch (ValorNegativoException | SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage());
		
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		
		} finally {
			System.out.println("Fim da operação");
		}
	}
}
