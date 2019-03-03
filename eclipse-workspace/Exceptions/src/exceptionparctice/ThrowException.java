package exceptionparctice;

public class ThrowException {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
//			throw new Exception();
//			throw new Throwable();
			new RuntimeException();
			System.out.println("Code here");
			
		} catch (Throwable e) {
			System.out.println("I caught an exc");
		}
		
		
		
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			System.out.println("INterrupted exception");
//		}
		System.out.println("End");
	}

}
