package practice;

public class InvalidPinCodeException extends RuntimeException{
	public InvalidPinCodeException() {
		super();
	}
	public InvalidPinCodeException(String message) {
		super(message);
	}

}
