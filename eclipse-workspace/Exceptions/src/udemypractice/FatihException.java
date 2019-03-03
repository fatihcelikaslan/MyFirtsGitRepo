package udemypractice;

public class FatihException extends ArithmeticException{
	
	public FatihException(String message) {
		super(message);
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("Error occured");
	}
	
	

}
