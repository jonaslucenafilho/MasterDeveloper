package stackTrace;

public class Pista {

	public void iniciar() throws PistaException {
		Automovel auto = new Automovel();
		
		try {
			auto.acelerar(100);
			auto.acelerar(90);
			
		} catch (AcimaDaVelocidadeMaximaException e) {
			throw new PistaException("Problema na pista", e);
		}
	}
}
