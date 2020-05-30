package exception;

public class ContaBancaria {

	double saldo = 1000;
	
	public void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {
		
		checarValorNegativo(valor);
		checarSaque(saldo, valor);
		
		saldo -= valor;
	}
	
	public void depositar(double valor) throws ValorNegativoException {
		
		checarValorNegativo(valor);
		
		saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	static void checarValorNegativo(double valor) throws ValorNegativoException {
		if (valor <= 0) {
			throw new ValorNegativoException("Valor inválido");
		}
	}
	
	static void checarSaque(double saldo, double valor) throws SaldoInsuficienteException {
		if (saldo - valor < 0) {
			throw new SaldoInsuficienteException("Saldo Insuficiente");
		}
	}
}
