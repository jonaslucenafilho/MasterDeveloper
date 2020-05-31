package stacktrace;

public class PistaException extends Exception {

	private static final long serialVersionUID = 1L;

	public PistaException(String message, Throwable cause) {
		super(message, cause);
	}
}
