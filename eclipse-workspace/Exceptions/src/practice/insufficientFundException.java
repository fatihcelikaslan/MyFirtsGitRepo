package practice;

public class insufficientFundException extends RuntimeException {
public insufficientFundException() {
	super();
}
public insufficientFundException(String message) {
	super(message);
}
}
