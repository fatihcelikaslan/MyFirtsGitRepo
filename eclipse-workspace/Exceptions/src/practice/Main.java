package practice;

public class Main {

	public static void main(String[] args) {
		try {
			throw new InvalidCardException();
		} catch (InvalidCardException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	throw new insufficientFundException("No money");
	throw new InvalidPinCodeException("Wrong pin number");
	}
}
