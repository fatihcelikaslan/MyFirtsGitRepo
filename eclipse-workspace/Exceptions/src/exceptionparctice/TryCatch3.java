package exceptionparctice;

public class TryCatch3 {

	public static void main(String[] args) {
		String[] arr = new String[8];
		arr[1] = null;
		Object o = new Object();
		int i = 0;

		try {
			System.out.println(arr[2].length());
			System.out.println(9 / i);
			String str = (String) o;
			

		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception found ");
			try{System.out.println(7/i);}
			catch(ArithmeticException opp) {
				System.out.println("Arith exc found in catch block");
			}
		}  catch (ClassCastException u) {
			System.out.println("Cast exc found");
		}catch (ArithmeticException j) {
			System.out.println("Arithmetic except found");
		}

	}

}
