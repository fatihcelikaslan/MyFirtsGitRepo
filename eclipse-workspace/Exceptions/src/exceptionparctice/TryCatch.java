package exceptionparctice;

public class TryCatch {

	public static void main(String[] args) {
		int a = 0;
		int b = 8;
		
		try {
			int g = b/a;
			
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic exception caught");
		}
		
		try {
			Object o = new Object();
			String str = (String) o;
		}
		catch(ClassCastException c) {
			System.out.println("ClassCast Exception Found");
		}
		
		

	}

}
