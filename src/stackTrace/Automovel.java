package stackTrace;

public class Automovel {
	private static final int VELOCIDADE_MAXIMA = 180;

	private int velocidadeAtual;
	
	public void acelerar(int velocidade) throws AcimaDaVelocidadeMaximaException {
		
		if (velocidadeAtual + velocidade > VELOCIDADE_MAXIMA) {
			throw new AcimaDaVelocidadeMaximaException("Excedeu a velocidade máxima");
		}
		
		velocidadeAtual += velocidade;
	}
}
