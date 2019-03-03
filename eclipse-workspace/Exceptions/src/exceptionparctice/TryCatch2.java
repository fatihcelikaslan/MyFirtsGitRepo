package exceptionparctice;

public class TryCatch2 {

	public static void main(String[] args) {
		int[] arr = new int[4];
		int i = 0;
		try {
			System.out.println(6 / 0);
			System.out.println(arr[4]);
			
		} catch (ArithmeticException e) {
			System.out.println("Exception");
			System.out.println(6/++i);
		} catch (ArrayIndexOutOfBoundsException j) {
			System.out.println("Array except found");
		}

	}

}
