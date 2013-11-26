package pl.edu.uj.tcs.memoizer.plugins;

/**
 * Exception can be casted when some plugin does not provide given view
 * @author ziemin
 *
 */
public class InvalidViewException extends IllegalArgumentException {

	public InvalidViewException(String message) {
		super(message);
	}
	
	public InvalidViewException() {
		super();
	}
}
